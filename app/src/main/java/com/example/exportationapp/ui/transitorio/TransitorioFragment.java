package com.example.exportationapp.ui.transitorio;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.anychart.AnyChartView;
import com.anychart.core.stock.indicators.TRIX;
import com.example.exportationapp.ChartsView;
import com.example.exportationapp.R;
import com.example.exportationapp.exportationapi.ExportationApi;
import com.example.exportationapp.models.Frutal;
import com.example.exportationapp.models.Transitorio;
import com.example.exportationapp.plugins.DataRequest;
import com.example.exportationapp.utils.DialogCultivos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TransitorioFragment extends Fragment {
    String CULTIVO_TYPE = "TRANSITORIOS";
    DataRequest data = new DataRequest();
    DialogCultivos dialog = new DialogCultivos();

    // Year picker
    Button btnYear;
    Integer year = Calendar.getInstance().get(Calendar.YEAR) - 2 ;

    // Any Chart View
    AnyChartView anyChartView;

    // Retrofit request
    private Retrofit retrofit;
    private final static String BASE_URI = "https://www.datos.gov.co/resource/";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cultivo, container, false);

        // btnYear
        btnYear = view.findViewById(R.id.btnCultivoYear);
        btnYear.setText(year.toString());
        btnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.showYearDialog(view, retrofit, anyChartView, CULTIVO_TYPE);
            }
        });

        // Retroview get data
        retrofit = new Retrofit.Builder().baseUrl(BASE_URI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // any chart view
        anyChartView = view.findViewById(R.id.chartViewCultivo);
        anyChartView.setProgressBar(view.findViewById(R.id.progress_bar_cultivo));
        data.getDataTransitorios(btnYear.getText().toString(), retrofit, anyChartView);
        return view;
    }
}

