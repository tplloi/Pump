package com.huxq17.download.Utils;

import android.util.Log;

public class LogUtil {
    private static String TAG = "Pump";
    public static boolean mEnableLog = true;

    public static void e(String content) {
        if (mEnableLog) {
            Log.e(TAG, "Pump " + content);
        }
    }

    public static void i(String content) {
        if (mEnableLog) {
            Log.i(TAG, "Pump " + content);
        }
    }

    public static void d(String content) {
        if (mEnableLog) {
            Log.d(TAG, "Pump " + content);
        }
    }

    public static void v(String content) {
        if (mEnableLog) {
            Log.v(TAG, "Pump " + content);
        }
    }
}
