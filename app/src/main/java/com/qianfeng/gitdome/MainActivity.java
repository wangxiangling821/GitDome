package com.qianfeng.gitdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{
private int a;
    private View byId;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = 45;
        a= 345;
        byId = findViewById(R.id.tv_show);
    }
}
