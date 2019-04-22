package com.soar.example.other.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.soar.example.R;
import com.soar.example.fix.HotFixEngine;
import com.soar.example.fix.TestClass;
import com.soar.example.other.constant.DangerousPermissions;
import com.soar.example.other.utils.PermissionsUtils;

/**
 * https://www.jianshu.com/p/d17519d4952e
 */
public class FixActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fix);
        initView();
    }

    private void initView() {
        findViewById(R.id.bt_bug).setOnClickListener(this);
        findViewById(R.id.bt_fix).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_bug:
                new TestClass().showToast(null, getBaseContext());
                break;
            case R.id.bt_fix:
                PermissionsUtils.checkPermission(this, permissions -> HotFixEngine.copyDexFileToAppAndFix(this,
                        "classes_fix.dex", true), DangerousPermissions.WRITE_EXTERNAL_STORAGE);
                break;
        }
    }
}
