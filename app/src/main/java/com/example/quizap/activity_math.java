package com.example.quizap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_math extends AppCompatActivity {

    private int number = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        levelButtons();
    }

    public void levelButtons() {
        findViewById(R.id.gradeSchoolButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.highSchoolButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.collegeButton).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.gradeSchoolButton:
                    Intent intent = new Intent(activity_math.this, activity_quiz_main.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("number",number);
                    intent.putExtras(bundle);
                    activity_math.this.finish();
                    startActivity(intent);
                    break;
            }
        }
    };
}