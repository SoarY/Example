package com.soar.example.other.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.soar.example.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.bt_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_1://设计模式
                startActivity(new Intent(this, DesignPatternActivity.class));
                break;
            case R.id.bt_2://热修复(ClassLoader原理)
                startActivity(new Intent(this, FixActivity.class));
                break;
            case R.id.bt_3://Hook技术
                startActivity(new Intent(this, HookActivity.class));
                break;
        }
    }
}
