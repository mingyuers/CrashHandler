package com.fangm.app.crashhandler.impl;

import android.os.Environment;
import android.util.Log;

import com.fangm.app.crashhandler.ICrashLogService;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrashLogServiceImpl implements ICrashLogService {
    private final String TAG = CrashLogServiceImpl.class.getName();



    @Override
    public void saveCrashLog(String log) {
        try {
            long timestamp = System.currentTimeMillis();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            String time = formatter.format(new Date());
            String fileName = "crash-" + time + "-" + timestamp + ".txt";
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                String path = "/sdcard/_CrashLog/";
                File dir = new File(path);
                if (!dir.exists()) {
                   dir.mkdirs();
                }
                FileOutputStream fos = new FileOutputStream(path + fileName);
                fos.write(log.toString().getBytes());
                fos.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "an error occured while writing file...", e);
        }
    }

}
