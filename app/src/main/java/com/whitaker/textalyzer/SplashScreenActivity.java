package com.whitaker.textalyzer;

import com.whitaker.textalyzer.util.TextalyzerApplication;
import com.whitaker_iacob.textalyzer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity 
{
    private final int SPLASH_DISPLAY_LENGTH = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
            	TextalyzerApplication app = (TextalyzerApplication) SplashScreenActivity.this.getApplication();
            	app.initMap();
            	app.populateMap();

                Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}