package com.example.quizap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_worldhistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldhistory);

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

            Bundle score_code = getIntent().getExtras();
            int score = score_code.getInt("score");


            int gradeschool = 300;
            int highschool = 301;
            int college = 302;

            switch (v.getId()){
                case R.id.gradeSchoolButton:
                    Intent intent = new Intent( activity_worldhistory.this, activity_quiz_main.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("number",gradeschool);
                    bundle.putInt("score", score);
                    intent.putExtras(bundle);
                    activity_worldhistory.this.finish();
                    startActivity(intent);
                    break;
                case R.id.highSchoolButton:
                    Intent intent1 = new Intent( activity_worldhistory.this, activity_quiz_main.class);
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("number",highschool);
                    bundle1.putInt("score", score);
                    intent1.putExtras(bundle1);
                    activity_worldhistory.this.finish();
                    startActivity(intent1);
                    break;
                case R.id.collegeButton:
                    Intent intent2 = new Intent( activity_worldhistory.this, activity_quiz_main.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("number",college);
                    bundle2.putInt("score", score);
                    intent2.putExtras(bundle2);
                    activity_worldhistory.this.finish();
                    startActivity(intent2);
                    break;

            }
        }
    };
}