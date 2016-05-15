package ru.jollydroid.mylibrary;

import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by tse on 14/05/16.
 */
public class MyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivty);

        Logger.l(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Logger.l(this, "" + newConfig.screenWidthDp + "x" + newConfig.screenHeightDp);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.l(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density  = getResources().getDisplayMetrics().density;
        int dpHeight = Math.round(outMetrics.heightPixels / density);
        int dpWidth  = Math.round(outMetrics.widthPixels / density);

        Logger.l(this, "" + dpWidth + "x" + dpHeight);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.l(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.l(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.l(this);
    }


}
