package com.leduyhung.loglibrary;

import android.util.Log;

/**
 * Created by hungleduy on 9/28/17.
 */
public class Logg {

    private static String namePakage;
    private static boolean allowShow;

    public static void init(String appName, boolean allow) {

        namePakage = appName;
        allowShow = allow;
    }

    public static void verbose(Class aclass, String message) {

        if (allowShow)
            Log.v(namePakage + "_" + aclass.getSimpleName(), message != null ? message : "log is null message");
    }

    public static void debug(Class aclass, String message) {

        if (allowShow)
            Log.d(namePakage + "_" + aclass.getSimpleName(), message != null ? message : "log is null message");
    }

    public static void info(Class aclass, String message) {

        if (allowShow)
            Log.i(namePakage + "_" + aclass.getSimpleName(), message != null ? message : "log is null message");
    }

    public static void warn(Class aclass, String message) {

        if (allowShow)
            Log.w(namePakage + "_" + aclass.getSimpleName(), message != null ? message : "log is null message");
    }

    public static void error(Class aclass, String message) {

        if (allowShow)
            Log.e(namePakage + "_" + aclass.getSimpleName(), message != null ? message : "log is null message");
    }
}