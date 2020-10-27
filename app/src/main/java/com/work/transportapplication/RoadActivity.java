package com.work.transportapplication;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.TimeZone;

public class RoadActivity extends AppCompatActivity {
    private String mYear;
    private String mMonth;
    private String mDay;
    private String mWay;

    private ImageView ivDemo1;
    private ImageView ivDemo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);

        TextView time = (TextView) findViewById(R.id.tv_time);
        TextPaint tp = time.getPaint();
        tp.setFakeBoldText(true);

        ivDemo1 = findViewById(R.id.image1);
        ivDemo2 = findViewById(R.id.image2);

        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        mYear = String.valueOf(c.get(Calendar.YEAR)); // 获取当前年份
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份
        mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// 获取当前月份的日期号码
        mWay = String.valueOf(c.get(Calendar.DAY_OF_WEEK));
        if ("1".equals(mWay)) {
            mWay = "天";
        } else if ("2".equals(mWay)) {
            mWay = "一";
        } else if ("3".equals(mWay)) {
            mWay = "二";
        } else if ("4".equals(mWay)) {
            mWay = "三";
        } else if ("5".equals(mWay)) {
            mWay = "四";
        } else if ("6".equals(mWay)) {
            mWay = "五";
        } else if ("7".equals(mWay)) {
            mWay = "六";
        }
        String datetime = mYear + "-" + mMonth + "-" + mDay + "\n" + "星期" + mWay;
        time.setText(datetime);

        //帧动画
        ivDemo1.setBackgroundResource(R.drawable.animation_image);
        AnimationDrawable animation1 = (AnimationDrawable) ivDemo1.getBackground();
        animation1.start();

        ivDemo2.setBackgroundResource(R.drawable.animation_image2);
        AnimationDrawable animation2 = (AnimationDrawable) ivDemo2.getBackground();
        animation2.start();
    }
}
