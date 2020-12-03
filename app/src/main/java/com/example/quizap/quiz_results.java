package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class quiz_results extends AppCompatActivity {

    TextView fScore, textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        fScore = (TextView) findViewById(R.id.scoreResult);
        textResult = (TextView) findViewById(R.id.textResult);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        double d_score = score;
        double score_percent = (d_score/10)*(100);
        int finalScore = (int)Math.round(score_percent);


        if(finalScore <= 50){
            fScore.setText(finalScore+"% Score");
        }

        fScore.setText(finalScore+"% Score");
        textResult.setText("You attempt 10 questions and \nfrom that "+score+" answer is correct.");

        findViewById(R.id.continueBtn).setOnClickListener(buttonClickListener);
        findViewById(R.id.checkAns).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int LiteratureGradeSchool = 100;
            int LiteratureHighSchool = 101;
            int LiteratureCollege = 102;

            int MathGradeSchool = 200;
            int MathHighSchool = 201;
            int MathCollege = 202;

            int HistoryGradeSchool = 300;
            int HistoryHighSchool = 301;
            int HistoryCollege = 302;

            switch (v.getId()){
                case R.id.continueBtn:
                    Intent intent = new Intent(quiz_results.this, MainActivity.class);
                    quiz_results.this.finish();
                    startActivity(intent);
                    break;

                case R.id.checkAns:

                    Bundle bundle = getIntent().getExtras();
                    int level_code = bundle.getInt("level");

                    switch(level_code){
                        case 100:
                            Intent LiteratureGradeSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle LiteratureGradeSchool_bundle = new Bundle();
                            LiteratureGradeSchool_bundle.putInt("result", LiteratureGradeSchool);
                            LiteratureGradeSchool_check.putExtras(LiteratureGradeSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(LiteratureGradeSchool_check);
                            break;

                        case 101:
                            Intent LiteratureHighSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle LiteratureHighSchool_bundle = new Bundle();
                            LiteratureHighSchool_bundle.putInt("result", LiteratureHighSchool);
                            LiteratureHighSchool_check.putExtras(LiteratureHighSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(LiteratureHighSchool_check);
                            break;

                        case 102:
                            Intent LiteratureCollege_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle LiteratureCollege_bundle = new Bundle();
                            LiteratureCollege_bundle.putInt("result", LiteratureCollege);
                            LiteratureCollege_check.putExtras(LiteratureCollege_bundle);
                            quiz_results.this.finish();
                            startActivity(LiteratureCollege_check);
                            break;
                        case 200:
                            Intent MathGradeSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle MathGradeSchool_bundle = new Bundle();
                            MathGradeSchool_bundle.putInt("result", MathGradeSchool);
                            MathGradeSchool_check.putExtras(MathGradeSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(MathGradeSchool_check);
                            break;
                        case 201:
                            Intent MathHighSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle MathHighSchool_bundle = new Bundle();
                            MathHighSchool_bundle.putInt("result", MathHighSchool);
                            MathHighSchool_check.putExtras(MathHighSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(MathHighSchool_check);
                            break;

                        case 202:
                            Intent MathCollege_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle MathCollege_bundle = new Bundle();
                            MathCollege_bundle.putInt("result", MathCollege);
                            MathCollege_check.putExtras(MathCollege_bundle);
                            quiz_results.this.finish();
                            startActivity(MathCollege_check);
                            break;

                        case 300:
                            Intent HistoryGradeSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle HistoryGradeSchool_bundle = new Bundle();
                            HistoryGradeSchool_bundle.putInt("result", HistoryGradeSchool);
                            HistoryGradeSchool_check.putExtras(HistoryGradeSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(HistoryGradeSchool_check);
                            break;
                        case 301:
                            Intent HistoryHighSchool_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle HistoryHighSchool_bundle = new Bundle();
                            HistoryHighSchool_bundle.putInt("result", HistoryHighSchool);
                            HistoryHighSchool_check.putExtras(HistoryHighSchool_bundle);
                            quiz_results.this.finish();
                            startActivity(HistoryHighSchool_check);
                            break;
                        case 302:
                            Intent HistoryCollege_check = new Intent(quiz_results.this, activity_results.class);
                            Bundle HistoryCollege_bundle = new Bundle();
                            HistoryCollege_bundle.putInt("result", HistoryCollege);
                            HistoryCollege_check.putExtras(HistoryCollege_bundle);
                            quiz_results.this.finish();
                            startActivity(HistoryCollege_check);
                            break;

                    }

                    break;
            }
        }
    };
}