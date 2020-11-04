package com.work.transportapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class VolleyTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_test);

        //1. 创建一个请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(VolleyTestActivity.this);

        //2. 创建一个POST请求
        String url = "http://api.m.mtime.cn/PageSubArea/TrailerList.api";
        StringRequest stringRequest = new StringRequest(Request.Method.POST,url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.d("TAG", s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.d("TAG" , volleyError.getMessage() , volleyError);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String , String > map  = new HashMap<>();
                return map;
            }
        };
        //3. 将创建的请求添加到请求队列中
        requestQueue.add(stringRequest);
    }
}
