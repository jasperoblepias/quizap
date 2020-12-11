package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        caseButtons();
    }

    public void caseButtons() {
        findViewById(R.id.acoount_btn).setOnClickListener(buttonClickListener);
        findViewById(R.id.create_account_btn).setOnClickListener(buttonClickListener);
        findViewById(R.id.leaderboard_btn).setOnClickListener(buttonClickListener);
        findViewById(R.id.help_btn).setOnClickListener(buttonClickListener);
        findViewById(R.id.back_btn).setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.create_account_btn:
                    Intent intent = new Intent(activity_hamburger.this, create_account.class);
                    activity_hamburger.this.finish();
                    startActivity(intent);
                    break;

                case R.id.acoount_btn:
                    Intent intent1 = new Intent(activity_hamburger.this, account.class);
                    activity_hamburger.this.finish();
                    startActivity(intent1);
                    break;

                case R.id.leaderboard_btn:
                    Intent intent2 = new Intent(activity_hamburger.this, leaderboards.class);
                    activity_hamburger.this.finish();
                    startActivity(intent2);
                    break;

                case R.id.help_btn:
                    Intent intent3 = new Intent(activity_hamburger.this, help_button.class);
                    activity_hamburger.this.finish();
                    startActivity(intent3);
                    break;

                case R.id.back_btn:
                    Intent intent4 = new Intent(activity_hamburger.this, MainActivity.class);
                    activity_hamburger.this.finish();
                    startActivity(intent4);
                    break;
            }
        }
    };
}