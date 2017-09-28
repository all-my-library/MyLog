package com.example.hungleduy.mylog;

import android.app.Application;

import com.leduyhung.loglibrary.Logg;

/**
 * Created by hungleduy on 9/28/17.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Logg.init(getString(R.string.app_name), true);
    }
}
