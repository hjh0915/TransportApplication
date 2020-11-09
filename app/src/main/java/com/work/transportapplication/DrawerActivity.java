package com.work.transportapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.view.View;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import android.widget.ImageView;

public class DrawerActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    //侧滑菜单栏
    private NavigationView navigationView;
    //标题栏-侧滑-按钮
    ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        //开启手势滑动打开侧滑菜单栏，如果要关闭手势滑动，将后面的UNLOCKED替换成LOCKED_CLOSED 即可
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        /**
         * 侧滑菜单item点击事件
         */
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent1 = new Intent();
                        intent1.setClass(DrawerActivity.this, HistogramActivity.class);
                        startActivity(intent1);
                        //此处不能加Finsh杀死界面否则点击返回会退出程序而不是回到主界面
                        break;
                    case R.id.nav_gallery:
                        Intent intent2 = new Intent();
                        intent2.setClass(DrawerActivity.this, PieActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_slideshow:
                        Intent intent3 = new Intent();
                        intent3.setClass(DrawerActivity.this, MapActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.nav_line:
                        Intent intent4 = new Intent();
                        intent4.setClass(DrawerActivity.this, LineActivity.class);
                        startActivity(intent4);
                        break;
                    default:
                        break;
                }
                drawerLayout.closeDrawer(navigationView);
                return true;
            }
        });
    }
}