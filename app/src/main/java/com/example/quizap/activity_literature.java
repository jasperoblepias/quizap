package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_literature extends AppCompatActivity {

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

            int gradeschool = 100;
            int highschool = 101;
            int college = 102;
            switch (v.getId()){
                case R.id.gradeSchoolButton:
                    Intent intent = new Intent(activity_literature.this, activity_quiz_main.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("number", gradeschool);
                    intent.putExtras(bundle);
                    activity_literature.this.finish();
                    startActivity(intent);
                    break;
                case R.id.highSchoolButton:
                    Intent intent1 = new Intent(activity_literature.this, activity_quiz_main.class);
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("number", highschool);
                    intent1.putExtras(bundle1);
                    activity_literature.this.finish();
                    startActivity(intent1);
                    break;
                case R.id.collegeButton:
                    Intent intent2 = new Intent(activity_literature.this, activity_quiz_main.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("number", college);
                    intent2.putExtras(bundle2);
                    activity_literature.this.finish();
                    startActivity(intent2);
                    break;
            }
        }
    };
}