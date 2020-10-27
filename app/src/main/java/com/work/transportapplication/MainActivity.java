package com.work.transportapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button road_condition = (Button)findViewById(R.id.btn_road_condition);
        road_condition.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_road_condition:
                Intent intent1 = new Intent(this, RoadActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
