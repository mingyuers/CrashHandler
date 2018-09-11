package com.fangm.demo.crashhandler;

import android.app.Application;

import com.fangm.app.crashhandler.CrashHandler;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.init(new CrashHandler.Builder(this));
    }
}
