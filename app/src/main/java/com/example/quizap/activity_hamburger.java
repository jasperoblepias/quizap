package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class activity_hamburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        DisplayMetrics dm_hamburger = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm_hamburger);

        int width = dm_hamburger.widthPixels;
        int height = dm_hamburger.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }
}