package com.hfnbd.zhjmaho.baseproject;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.CsvFormatStrategy;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by ZHJMAHO on 2018/2/17
 * On purpose of
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        initLogger();
    }

    private void initLogger() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                .tag("maho")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });
    }
}
