package com.example.exportationapp.ui.frutal;

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
import com.example.exportationapp.ChartsView;
import com.example.exportationapp.R;
import com.example.exportationapp.exportationapi.ExportationApi;
import com.example.exportationapp.models.Frutal;
import com.example.exportationapp.Cultivo;
import com.example.exportationapp.sort.ShellSort;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FrutalFragment extends Fragment {
    private final static String[] CULTIVOS = {"Aguacate", "Bananito", "Banano", "Borojó", "Chontaduro",
            "Citricos", "Coco", "Granadilla", "Guanabana", "Lulo", "Mango", "Maracuyá",
            "Melón A", "Melón B", "Mora", "Papaya", "Piña", "Pitaya", "Tomate Arbol", "Vid"
    };

    // Year picker
    Button btnYear;
    Integer year = Calendar.getInstance().get(Calendar.YEAR) - 2 ;

    // Any Chart View
    AnyChartView anyChartView;
    ArrayList<String> cultivos = new ArrayList<String>();
    ArrayList<Double> tons = new ArrayList<Double>();
    ChartsView chartsView = new ChartsView();

    // Retrofit request
    private Retrofit retrofit;
    private List<Frutal> frutales;
    private final static String LOGS = "---| ";
    private final static String BASE_URL = "https://www.datos.gov.co/resource/";
    private final static String API = "vmj9-n8gi.json";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cultivo, container, false);

        // btnYear
        btnYear = view.findViewById(R.id.btnCultivoYear);
        btnYear.setText(year.toString());
        btnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showYearDialog(view);
            }
        });

        // Retroview get data
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // any chart view
        anyChartView = view.findViewById(R.id.chartViewCultivo);
        anyChartView.setProgressBar(view.findViewById(R.id.progress_bar_cultivo));
        getData();

        return view;
    }

    // -----------------------------------------------------------------------
    // Retrofit Request
    private void getData() {
        try {
            ExportationApi service = retrofit.create(ExportationApi.class);
            Call<List<Frutal>> call = service.getReportFrutales(API+"?a_o="+year.toString());

            call.enqueue(new Callback<List<Frutal>>() {
                @Override
                public void onResponse(Call<List<Frutal>> call, Response<List<Frutal>> response) {
                    if (response.isSuccessful()) {
                        frutales = response.body();
                        sortCultivosFrutales();
                        chartsView.setupColumnChart(cultivos, tons, anyChartView);
                    } else {
                        Log.e(LOGS, "onResponse: " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<List<Frutal>> call, Throwable t) {
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
                cultivos.clear();
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

    //-----------------------------------------------------------------------------
    public void sortCultivosFrutales() {

        ArrayList<Cultivo> cultivosTons = cleanArrayCultivos();
        Cultivo tmpCultivo;

        for(int i = 0; i < frutales.size(); i++) {
            Frutal report = frutales.get(i);
            tmpCultivo = cultivosTons.get(0); tmpCultivo.sumTons(report.getAguacate()); cultivosTons.set(0, tmpCultivo);
            tmpCultivo = cultivosTons.get(1); tmpCultivo.sumTons(report.getBananito()); cultivosTons.set(1, tmpCultivo);
            tmpCultivo = cultivosTons.get(2); tmpCultivo.sumTons(report.getBanano()); cultivosTons.set(2, tmpCultivo);
            tmpCultivo = cultivosTons.get(3); tmpCultivo.sumTons(report.getBoroj()); cultivosTons.set(3, tmpCultivo);
            tmpCultivo = cultivosTons.get(4); tmpCultivo.sumTons(report.getChontaduro()); cultivosTons.set(4, tmpCultivo);
            tmpCultivo = cultivosTons.get(5); tmpCultivo.sumTons(report.getCitricos()); cultivosTons.set(5, tmpCultivo);
            tmpCultivo = cultivosTons.get(6); tmpCultivo.sumTons(report.getCoco()); cultivosTons.set(6, tmpCultivo);
            tmpCultivo = cultivosTons.get(7); tmpCultivo.sumTons(report.getGranadilla()); cultivosTons.set(7, tmpCultivo);
            tmpCultivo = cultivosTons.get(8); tmpCultivo.sumTons(report.getGuanaBana()); cultivosTons.set(8, tmpCultivo);
            tmpCultivo = cultivosTons.get(9); tmpCultivo.sumTons(report.getLulo()); cultivosTons.set(9, tmpCultivo);
            tmpCultivo = cultivosTons.get(10); tmpCultivo.sumTons(report.getMango()); cultivosTons.set(10, tmpCultivo);
            tmpCultivo = cultivosTons.get(11); tmpCultivo.sumTons(report.getMaracuy()); cultivosTons.set(11, tmpCultivo);
            tmpCultivo = cultivosTons.get(12); tmpCultivo.sumTons(report.getMelNA()); cultivosTons.set(12, tmpCultivo);
            tmpCultivo = cultivosTons.get(13); tmpCultivo.sumTons(report.getMelNB()); cultivosTons.set(13, tmpCultivo);
            tmpCultivo = cultivosTons.get(14); tmpCultivo.sumTons(report.getMora()); cultivosTons.set(14, tmpCultivo);
            tmpCultivo = cultivosTons.get(15); tmpCultivo.sumTons(report.getPapaya()); cultivosTons.set(15, tmpCultivo);
            tmpCultivo = cultivosTons.get(16); tmpCultivo.sumTons(report.getPiA()); cultivosTons.set(16, tmpCultivo);
            tmpCultivo = cultivosTons.get(17); tmpCultivo.sumTons(report.getPitaya()); cultivosTons.set(17, tmpCultivo);
            tmpCultivo = cultivosTons.get(18); tmpCultivo.sumTons(report.getTomateArbol()); cultivosTons.set(18, tmpCultivo);
            tmpCultivo = cultivosTons.get(19); tmpCultivo.sumTons(report.getVid()); cultivosTons.set(19, tmpCultivo);
        }

        ShellSort shell = new ShellSort(cultivosTons);
        cultivosTons = shell.sort();
        for ( int i = cultivosTons.size()-1; i >= cultivosTons.size()-5; i--) {
            Cultivo cultivo = cultivosTons.get(i);
            this.cultivos.add(cultivo.getName());
            this.tons.add(cultivo.getTons());
        }
    }

    public ArrayList<Cultivo> cleanArrayCultivos() {
        ArrayList<Cultivo> cultivos = new ArrayList<Cultivo>();
        for (int i = 0; i < CULTIVOS.length; i++) {
            cultivos.add(new Cultivo(CULTIVOS[i], 0.0));
        }
        return cultivos;
    }
}
