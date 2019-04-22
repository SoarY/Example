package com.soar.example.other;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    private static Context context;
    private static MyApplication instance;

    public void onCreate() {
        super.onCreate();
        init();
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return context;
    }

    private void init() {
        instance = this;
        context = getApplicationContext();
    }
}
