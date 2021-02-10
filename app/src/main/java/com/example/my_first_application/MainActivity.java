package com.example.my_first_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart chart1 = (BarChart) findViewById(R.id.chart1);
        BarChart chart2 = (BarChart) findViewById(R.id.chart2);
        BarChart chart3 = (BarChart) findViewById(R.id.chart3);


        BarData data1 = new BarData(getDataSet());
        chart1.setData(data1);
        chart1.animateXY(2000, 2000);
        chart1.invalidate();

        BarData data2 = new BarData(getDataSet());
        chart2.setData(data2);
        chart2.animateXY(2000, 2000);
        chart2.invalidate();

        BarData data3 = new BarData(getDataSet());
        chart3.setData(data3);
        chart3.animateXY(2000, 2000);
        chart3.invalidate();
    }

    private ArrayList<IBarDataSet> getDataSet() {

        ArrayList valueSet1 = new ArrayList();
        BarEntry v1e1 = new BarEntry(0, 110.000f); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(2, 40f); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(4, 60f); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(6, 30f); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(8, 90f); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(10, 100f); // Jun
        valueSet1.add(v1e6);

        ArrayList valueSet2 = new ArrayList();
        BarEntry v2e1 = new BarEntry(.5f, 150f); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(2.5f, 90f); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(4.5f, 120f); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(6.5f, 60f); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(8.5f, 20f); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(10.5f, 80f); // Jun
        valueSet2.add(v2e6);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList getXAxisValues() {
        ArrayList xAxis = new ArrayList();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }
}