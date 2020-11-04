package com.work.transportapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button road_condition = (Button)findViewById(R.id.btn_road_condition);
        road_condition.setOnClickListener(this);

        Button histogram = (Button)findViewById(R.id.btn_histogram);
        histogram.setOnClickListener(this);

        Button pie = (Button)findViewById(R.id.btn_pie);
        pie.setOnClickListener(this);

        Button volley = (Button)findViewById(R.id.btn_volley);
        volley.setOnClickListener(this);

        Button line = (Button)findViewById(R.id.btn_line);
        line.setOnClickListener(this);

        Button webView = (Button)findViewById(R.id.btn_web_view);
        webView.setOnClickListener(this);

        Button qr_code = (Button)findViewById(R.id.btn_qr_code);
        qr_code.setOnClickListener(this);

        Button map = (Button)findViewById(R.id.btn_map);
        map.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_road_condition:
                Intent intent1 = new Intent(this, RoadActivity.class);
                startActivity(intent1);
                break;

            case R.id.btn_map:
                Intent intent2 = new Intent(this, MapActivity.class);
                startActivity(intent2);
                break;

            case R.id.btn_histogram:
                Intent intent3 = new Intent(this, HistogramActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn_pie:
                Intent intent4 = new Intent(this, PieActivity.class);
                startActivity(intent4);

            case R.id.btn_volley:
                Intent intent5 = new Intent(this, VolleyTestActivity.class);
                startActivity(intent5);

            case R.id.btn_line:
                Intent intent6 = new Intent(this, LineActivity.class);
                startActivity(intent6);
                break;

            case R.id.btn_web_view:
                Intent intent7 = new Intent(this, WebViewActivity.class);
                startActivity(intent7);
                break;

            case R.id.btn_qr_code:
                Intent intent8 = new Intent(this, QRCodeActivity.class);
                startActivity(intent8);
                break;
            default:
                break;
        }
    }
}
