package com.example.exportationapp.ui.permanente;

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

public class PermanenteFragment extends Fragment {
    String CULTIVO_TYPE = "PERMANENTES";
    DataRequest data = new DataRequest();
    DialogCultivos dialog = new DialogCultivos();

    // Year picker
    Button btnYear;
    Integer year = Calendar.getInstance().get(Calendar.YEAR) - 2 ;

    // Any Chart View
    AnyChartView anyChartView;

    // Retrofit request
    private Retrofit retrofit;
    private static String BASE_URL = "https://www.datos.gov.co/resource/";

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

        TextView title = view.findViewById(R.id.text_cultivo);
        title.setText(getText(R.string.menu_permanentes));

        // Retroview get data
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // any chart view
        anyChartView = view.findViewById(R.id.chartViewCultivo);
        anyChartView.setProgressBar(view.findViewById(R.id.progress_bar_cultivo));
        data.getDataPermanentes(btnYear.getText().toString(), retrofit, anyChartView);

        return view;
    }
}