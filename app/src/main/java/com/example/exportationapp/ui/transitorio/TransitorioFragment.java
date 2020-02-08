package com.example.exportationapp.ui.transitorio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.anychart.AnyChartView;
import com.example.exportationapp.R;
import com.example.exportationapp.plugins.DataRequest;
import com.example.exportationapp.utils.DialogCultivos;

import java.util.Calendar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TransitorioFragment extends Fragment {
    DataRequest data = new DataRequest();

    // Any Chart View
    AnyChartView anyChartView;

    // Retrofit request
    private Retrofit retrofit;
    private final static String BASE_URI = "https://www.datos.gov.co/resource/";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transitorio, container, false);


        TextView title = view.findViewById(R.id.text_transitorio);
        title.setText(getText(R.string.menu_transitorios));

        // Retroview get data
        retrofit = new Retrofit.Builder().baseUrl(BASE_URI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // any chart view
        anyChartView = view.findViewById(R.id.chartViewTransitorio);
        anyChartView.setProgressBar(view.findViewById(R.id.progress_bar_transitorio));
        data.getDataTransitorios(retrofit, anyChartView);
        return view;
    }
}

