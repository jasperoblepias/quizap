package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_literature extends AppCompatActivity {

    private int number = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature);

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
                    Intent intent = new Intent(activity_literature.this, activity_quiz_main.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("number",number);
                    intent.putExtras(bundle);
                    activity_literature.this.finish();
                    startActivity(intent);
                    break;

            }
        }
    };
}