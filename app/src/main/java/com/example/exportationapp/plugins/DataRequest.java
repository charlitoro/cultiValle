package com.example.exportationapp.plugins;

import android.util.Log;

import com.anychart.AnyChartView;
import com.example.exportationapp.exportationapi.ExportationApi;
import com.example.exportationapp.models.Frutal;
import com.example.exportationapp.models.Permanente;
import com.example.exportationapp.models.Transitorio;
import com.example.exportationapp.plugins.sort.SortCultivos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class DataRequest {

    // Retrofit request
    private List<Frutal> frutales;
    private List<Permanente> permanentes;
    private List<Transitorio> transitorios;

    private final static String LOGS = "---| ";
    private final static String API_FRUTALES = "vmj9-n8gi.json";
    private final static String API_PERMANENTES = "v4ub-9eme.json";
    private final static String API_TRANSITORIOS = "vs5v-e66i.json";

    ChartsView chartsView = new ChartsView();
    final SortCultivos sort = new SortCultivos();

    // Retrofit Request
    public void getDataFrutales(String year, Retrofit retrofit, final AnyChartView anyChartView) {
        final ArrayList<String> cultivos = new ArrayList<String>();
        final ArrayList<Double> hectare = new ArrayList<Double>();

        try {
            ExportationApi service = retrofit.create(ExportationApi.class);
            Call<List<Frutal>> call = service.getReportFrutales(API_FRUTALES+"?a_o="+year);

            call.enqueue(new Callback<List<Frutal>>() {
                @Override
                public void onResponse(Call<List<Frutal>> call, Response<List<Frutal>> response) {
                    if (response.isSuccessful()) {
                        frutales = response.body();
                        sort.sortCultivosFrutales(frutales, cultivos, hectare);
                        chartsView.setupColumnChart(
                                cultivos, hectare, anyChartView,
                                 "Cultivos", "Hectarias"
                        );
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

    public void getDataPermanentes(String year, Retrofit retrofit, final AnyChartView anyChartView) {
        final ArrayList<String> cultivos = new ArrayList<String>();
        final ArrayList<Double> hectare = new ArrayList<Double>();

        try {
            ExportationApi service = retrofit.create(ExportationApi.class);
            Call<List<Permanente>> call = service.getReportPermanentes(API_PERMANENTES+"?a_o="+year);

            call.enqueue(new Callback<List<Permanente>>() {
                @Override
                public void onResponse(Call<List<Permanente>> call, Response<List<Permanente>> response) {
                    if (response.isSuccessful()) {
                        permanentes = response.body();
                        sort.sortCultivosPermanentes(permanentes, cultivos, hectare);
                        chartsView.setupPieChart(cultivos, hectare, anyChartView);
                    } else {
                        Log.e(LOGS, "onResponse: " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<List<Permanente>> call, Throwable t) {
                    Log.e(LOGS, "onFailure: " + t);
                }
            });
        } catch (Exception e) {
            Log.e(LOGS, "onFailure: " + e);
        }
    }

    public void getDataTransitorios(String year, Retrofit retrofit, final AnyChartView anyChartView) {
        final ArrayList<String> cultivos = new ArrayList<String>();
        final ArrayList<Double> hectare = new ArrayList<Double>();

        try {
            ExportationApi service = retrofit.create(ExportationApi.class);
            Call<List<Transitorio>> call = service.getReportTransitorios(API_TRANSITORIOS+"?a_o="+year);

            call.enqueue(new Callback<List<Transitorio>>() {
                @Override
                public void onResponse(Call<List<Transitorio>> call, Response<List<Transitorio>> response) {
                    if (response.isSuccessful()) {
                        transitorios = response.body();
                        assert transitorios != null;
                        sort.sortCultivosTransitorios(transitorios, cultivos, hectare);
                        chartsView.setup3DBarChart(cultivos, hectare, anyChartView);
                    } else {
                        Log.e(LOGS, "onResponse: " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<List<Transitorio>> call, Throwable t) {
                    Log.e(LOGS, "onFailure: " + t);
                }
            });
        } catch (Exception e) {
            Log.e(LOGS, "onFailure: " + e);
        }
    }
}
