package com.work.transportapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class PieActivity extends AppCompatActivity {
    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        pieChart =  findViewById(R.id.pie);
        pieChart = getPieChar(pieChart);
        pieChart.invalidate(); //在填充完数据后再刷新
    }

    public PieChart getPieChar(PieChart pieChart){
        //通过数组列表存储数据值
        List<PieEntry> entries=new ArrayList<>();
        entries.add(new PieEntry(28.6f,"有违章：28.6%"));
        entries.add(new PieEntry(71.3f,"无违章：71.3%"));

        PieDataSet pieDataSet=new PieDataSet(entries,"");
        pieDataSet.setColors(Color.BLUE,Color.RED);
        pieChart.setEntryLabelColor(Color.BLACK);
        //取消value显示
        pieDataSet.setDrawValues(false);
        //设置描述的位置
        pieDataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        //设置数据连接线长度
        pieDataSet.setValueLinePart1OffsetPercentage(100f);
        pieDataSet.setValueLinePart1Length(1f);

        PieData pieData=new PieData(pieDataSet);
        pieChart.setData(pieData);
        //去除水印
        pieChart.getDescription().setEnabled(false);

        //设置图例的位置
        pieChart.getLegend().setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
        pieChart.setDrawHoleEnabled(false);
        return pieChart;
    }
}
