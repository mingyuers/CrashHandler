package com.fangm.demo.crashhandler;

import android.app.Application;

import com.fangm.app.crashhandler.CrashHandler;
import com.fangm.app.crashhandler.impl.CrashLogServiceImpl;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.init(new CrashHandler.Builder(this));
//        CrashHandler.init(new CrashHandler.Builder(this)
//                .setCrashLogService(new CrashLogServiceImpl())
//                .setCrashTips("很抱歉,程序出现异常,即将退出")
//                .build()
//        );
    }
}
