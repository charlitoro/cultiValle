package com.example.exportationapp.utils;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.anychart.AnyChartView;
import com.example.exportationapp.R;
import com.example.exportationapp.plugins.DataRequest;

import org.jetbrains.annotations.NotNull;

import retrofit2.Retrofit;

public class DialogCultivos {

    DataRequest data = new DataRequest();
    Integer maxYear = 2018;
    Integer minYear = 2000;

    // DialogCultivos Year Picker
    public void showYearDialog(@NotNull View view, final Retrofit retrofit, final AnyChartView anyChartView, final String cultivoType) {
        final Button btnYear = view.findViewById(R.id.btnCultivoYear);
        final Dialog dialogYear = new Dialog(view.getContext());
        dialogYear.setTitle("Year Picker");
        dialogYear.setContentView(R.layout.year_dialog);

        Button btnSet = dialogYear.findViewById(R.id.btnSet);
        Button btnCancel = dialogYear.findViewById(R.id.btnCancel);
        TextView year_text = dialogYear.findViewById(R.id.year_text);

        year_text.setText(maxYear.toString());
        final NumberPicker nopicker = dialogYear.findViewById(R.id.yearPicker);

        nopicker.setMaxValue(maxYear);
        nopicker.setMinValue(minYear);
        nopicker.setWrapSelectorWheel(false);
        nopicker.setValue(maxYear);
        nopicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnYear.setText(String.valueOf(nopicker.getValue()));
                if (cultivoType.equals("FRUTALES")) {
                    data.getDataFrutales(String.valueOf(nopicker.getValue()), retrofit, anyChartView);
                } else if (cultivoType.equals("PERMANENTES")) {
                    data.getDataPermanentes(String.valueOf(nopicker.getValue()), retrofit, anyChartView);
                } else {
                    data.getDataTransitorios(String.valueOf(nopicker.getValue()), retrofit, anyChartView);
                }
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
