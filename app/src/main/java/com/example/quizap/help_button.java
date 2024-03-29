package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class help_button extends Activity {
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_button);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        btnClose = (Button) findViewById(R.id.okBtn);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        DisplayMetrics dm_help = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm_help);

        int width = dm_help.widthPixels;
        int height = dm_help.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}