package com.example.exportationapp;

import android.widget.ProgressBar;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.charts.Cartesian3d;
import com.anychart.charts.Pie;
import com.anychart.core.cartesian.series.Column;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;

import java.util.ArrayList;
import java.util.List;

public class ChartsView {

    // Retrofit Request
    public void setupPieChart(ArrayList<String> cultivos, ArrayList<Double> tons, AnyChartView anyChartView) {
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();
        for (int i = 0; i < cultivos.size(); i++) {
            dataEntries.add(new ValueDataEntry(cultivos.get(i), tons.get(i)));
        }
        pie.data(dataEntries);
        anyChartView.setChart(pie);
    }

    public void setupColumnChart(
            ArrayList<String> departments, ArrayList<Double> tons, AnyChartView anyChartView,
            String xTitle, String yTitle
    ) {
        Cartesian cartesian = AnyChart.column();
        List<DataEntry> dataEntries = new ArrayList<>();
        for (int i = 0; i < departments.size(); i++) {
            dataEntries.add(new ValueDataEntry(departments.get(i), tons.get(i)));
        }
        Column column = cartesian.column(dataEntries);
        column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(Anchor.CENTER_BOTTOM)
                .offsetX(0d)
                .offsetY(5d)
                .format("{%Value}{groupsSeparator: }");
        cartesian.animation(true);
        cartesian.yScale().minimum(0d);
        cartesian.yAxis(0).labels().format("{%Value}{groupsSeparator: }");
        cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
        cartesian.interactivity().hoverMode(HoverMode.BY_X);

        cartesian.xAxis(0).title(xTitle);
        cartesian.yAxis(0).title(yTitle);

        anyChartView.setChart(cartesian);
    }

    public void setup3DBarChart(ArrayList<String> cultivos, ArrayList<Double> tons, AnyChartView anyChartView) {
        Cartesian3d bar3d = AnyChart.bar3d();
        bar3d.animation(true);
        bar3d.padding(10d, 40d, 5d, 20d);
        bar3d.title("Cultivos");
        bar3d.yScale().minimum(0d);
        bar3d.xAxis(0).labels()
                .rotation(-90d)
                .padding(0d, 0d, 20d, 0d);
        bar3d.yAxis(0).labels().format("{%Value}{groupsSeparator: }");

        bar3d.yAxis(0).title("Hectarias");

        List<DataEntry> data = new ArrayList<>();
        for (int i = 0; i < cultivos.size(); i++) {
            data.add(new CustomDataEntry(cultivos.get(i), tons.get(i)));
        }
        Set set = Set.instantiate();
        set.data(data);
        Mapping bar1Data = set.mapAs("{ x: 'x', value: 'value' }");

        bar3d.bar(bar1Data)
                .name("Hectárias Sembradas");

        bar3d.legend().enabled(true);
        bar3d.legend().fontSize(13d);
        bar3d.legend().padding(0d, 0d, 20d, 0d);

        bar3d.interactivity().hoverMode(HoverMode.SINGLE);

        bar3d.tooltip()
            .positionMode(TooltipPositionMode.POINT)
            .position("right")
            .anchor(Anchor.LEFT_CENTER)
            .offsetX(5d)
            .offsetY(0d)
            .format("{%Value}");

        bar3d.zAspect("10%")
            .zPadding(20d)
            .zAngle(45d)
            .zDistribution(true);

        anyChartView.setChart(bar3d);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value) {
            super(x, value);
        }
    }
}
