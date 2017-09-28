package com.example.hungleduy.mylog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leduyhung.loglibrary.Logg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logg.debug(getClass(), "this is debug log");
        Logg.error(getClass(), "this is error log");
        Logg.info(getClass(), "this is info log");
        Logg.verbose(getClass(), "this is verbose log");
    }
}