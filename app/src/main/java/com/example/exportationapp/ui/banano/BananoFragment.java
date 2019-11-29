package com.example.exportationapp.ui.banano;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.anychart.AnyChartView;
import com.example.exportationapp.ChartsView;
import com.example.exportationapp.R;
import com.example.exportationapp.exportationapi.ExportationApi;
import com.example.exportationapp.models.Banano;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BananoFragment extends Fragment {

    // Year picker
    Button btnYear;
    Integer year = Calendar.getInstance().get(Calendar.YEAR) - 1 ;

    // Any Chart View
    AnyChartView anyChartView;
    ArrayList<String> departments = new ArrayList<String>();
    ArrayList<Double> tons = new ArrayList<Double>();
    ChartsView chartsView = new ChartsView();

    // Retrofit request
    private Retrofit retrofit;
    private List<Banano> bananos;
    private final static String LOGS = "---| ";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_banano, container, false);

        // btnYear
        btnYear = view.findViewById(R.id.btnBananoYear);
        btnYear.setText(year.toString());
        btnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showYearDialog(view);
            }
        });

        // Retroview get data
        retrofit = new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // any chart view
        anyChartView = view.findViewById(R.id.chartViewBanano);
        getData();

        return view;
    }

    // -----------------------------------------------------------------------
    // Retrofit Request
    private void getData() {
        try {
            ExportationApi service = retrofit.create(ExportationApi.class);
            Call<List<Banano>> call = service.getReportBanano("4k8e-ex6x.json?anio="+year.toString());

            call.enqueue(new Callback<List<Banano>>() {
                @Override
                public void onResponse(Call<List<Banano>> call, Response<List<Banano>> response) {
                    if (response.isSuccessful()) {
                        bananos = response.body();
                        for(int i=0; i < bananos.size(); i++) {
                            Banano report = bananos.get(i);
                            if (departments.contains(report.getDepartamentoorigen())) {
                                int index = departments.indexOf(report.getDepartamentoorigen());
                                tons.set(index, tons.get(index) + report.getVolumentoneladas());
                            } else {
                                departments.add(report.getDepartamentoorigen());
                                tons.add(report.getVolumentoneladas());
                            }
                        }
                        chartsView.setupColumnChart(departments, tons, anyChartView);
                    } else {
                        Log.e(LOGS, "onResponse: " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<List<Banano>> call, Throwable t) {
                    Log.e(LOGS, "onFailure: " + t);
                }
            });
        } catch (Exception e) {
            Log.e(LOGS, "onFailure: " + e);
        }
    }

    //---------------------------------------------------------------------------------
    // Dialog Year Picker
    public void showYearDialog(View view) {
        final Dialog dialogYear = new Dialog(view.getContext());
        dialogYear.setTitle("Year Picker");
        dialogYear.setContentView(R.layout.year_dialog);
        Button btnSet = dialogYear.findViewById(R.id.btnSet);
        Button btnCancel = dialogYear.findViewById(R.id.btnCancel);
        TextView year_text = dialogYear.findViewById(R.id.year_text);
        year_text.setText(year.toString());
        final NumberPicker nopicker = dialogYear.findViewById(R.id.yearPicker);

        nopicker.setMaxValue(year+50);
        nopicker.setMinValue(year-50);
        nopicker.setWrapSelectorWheel(false);
        nopicker.setValue(year);
        nopicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnYear.setText(String.valueOf(nopicker.getValue()));
                year = nopicker.getValue();
                departments.clear();
                tons.clear();
                getData();
                dialogYear.dismiss();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogYear.dismiss();
            }
        });
        dialogYear.show();
    }
}