package ru.jollydroid.mylibrary;

import android.content.Context;
import android.util.Log;

/**
 * Created by tse on 14/05/16.
 */
public class Logger {
    public static void l(Context context) {
        l(context, "");
    }

    public static void l(Context context, String str) {

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement e : stackTrace) {
            if (e.getClassName().contains("MyActivity")) {
                Log.d("happy", context.getPackageName() + " " + e.getClassName() + "." + e.getMethodName() + " " + str);
            }
        }
//        Log.d("happy", "" + e.getFileName() + ":" + e.getLineNumber() + " " + e.getClassName() + "." + e.getMethodName());
    }
}
