package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_results extends AppCompatActivity {

    private questionsLitGradeSchool questionsLitGradeSchool = new questionsLitGradeSchool();
    private questionsLitHighSchool questionsLitHighSchool = new questionsLitHighSchool();
    private questionsLitCollege questionsLitCollege = new questionsLitCollege();

    private questionsMathGradeSchool questionMath = new questionsMathGradeSchool();
    private questionsMathHighSchool questionsMathHighSchool = new questionsMathHighSchool();
    private questionsMathCollege questionsMathCollege = new questionsMathCollege();

    private questionsHistoryGradeSchool questionHistory = new questionsHistoryGradeSchool();
    private questionsHistoryHighSchool questionsHistoryHighSchool = new questionsHistoryHighSchool();
    private questionsHistoryCollege questionsHistoryCollege = new questionsHistoryCollege();

    private TextView question_1;
    private TextView question_2;
    private TextView question_3;
    private TextView question_4;
    private TextView question_5;
    private TextView question_6;
    private TextView question_7;
    private TextView question_8;
    private TextView question_9;
    private TextView question_10;

    private  TextView answer_1;
    private  TextView answer_2;
    private  TextView answer_3;
    private  TextView answer_4;
    private  TextView answer_5;
    private  TextView answer_6;
    private  TextView answer_7;
    private  TextView answer_8;
    private  TextView answer_9;
    private  TextView answer_10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        FVD_ID();

        Level_code_Switch();


    }

    private void Level_code_Switch(){
        Bundle bundle = getIntent().getExtras();
        int level_code = bundle.getInt("result");

        switch (level_code){
            //literature subject
            case 100:
                LiteratureGradeSchool();
                break;
            case 101:
                LiteratureHighSchool();
                break;
            case 102:
                LiteratureCollege();
                break;
            //math subject
            case 200:
                MathGradeSchool();
                break;
            case 201:
                MathHighSchool();
                break;
            case 202:
                MathCollege();
                break;
            //history subject
            case 300:
                HistoryGradeSchool();
                break;
            case 301:
                HistoryHighSchool();
                break;
            case 302:
                HistoryCollege();
                break;
        }
    }
    private void FVD_ID(){
        question_1 = (TextView)findViewById(R.id.question_1);
        question_2 = (TextView)findViewById(R.id.question_2);
        question_3 = (TextView)findViewById(R.id.question_3);
        question_4 = (TextView)findViewById(R.id.question_4);
        question_5 = (TextView)findViewById(R.id.question_5);
        question_6 = (TextView)findViewById(R.id.question_6);
        question_7 = (TextView)findViewById(R.id.question_7);
        question_8 = (TextView)findViewById(R.id.question_8);
        question_9 = (TextView)findViewById(R.id.question_9);
        question_10 = (TextView)findViewById(R.id.question_10);

        answer_1 = (TextView)findViewById(R.id.answer_1);
        answer_2 = (TextView)findViewById(R.id.answer_2);
        answer_3 = (TextView)findViewById(R.id.answer_3);
        answer_4 = (TextView)findViewById(R.id.answer_4);
        answer_5 = (TextView)findViewById(R.id.answer_5);
        answer_6 = (TextView)findViewById(R.id.answer_6);
        answer_7 = (TextView)findViewById(R.id.answer_7);
        answer_8 = (TextView)findViewById(R.id.answer_8);
        answer_9 = (TextView)findViewById(R.id.answer_9);
        answer_10 = (TextView)findViewById(R.id.answer_10);

        findViewById(R.id.ctn_btn).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(activity_results.this, MainActivity.class);
            activity_results.this.finish();
            startActivity(intent);
        }
    };


    private void LiteratureGradeSchool(){
        question_1.setText(questionsLitGradeSchool.getQuestions(0));
        question_2.setText(questionsLitGradeSchool.getQuestions(1));
        question_3.setText(questionsLitGradeSchool.getQuestions(2));
        question_4.setText(questionsLitGradeSchool.getQuestions(3));
        question_5.setText(questionsLitGradeSchool.getQuestions(4));
        question_6.setText(questionsLitGradeSchool.getQuestions(5));
        question_7.setText(questionsLitGradeSchool.getQuestions(6));
        question_8.setText(questionsLitGradeSchool.getQuestions(7));
        question_9.setText(questionsLitGradeSchool.getQuestions(8));
        question_10.setText(questionsLitGradeSchool.getQuestions(9));

        answer_1.setText(questionsLitGradeSchool.getQuestions(0));
        answer_2.setText(questionsLitGradeSchool.getQuestions(1));
        answer_3.setText(questionsLitGradeSchool.getQuestions(2));
        answer_4.setText(questionsLitGradeSchool.getQuestions(3));
        answer_5.setText(questionsLitGradeSchool.getQuestions(4));
        answer_6.setText(questionsLitGradeSchool.getQuestions(5));
        answer_7.setText(questionsLitGradeSchool.getQuestions(6));
        answer_8.setText(questionsLitGradeSchool.getQuestions(7));
        answer_9.setText(questionsLitGradeSchool.getQuestions(8));
        answer_10.setText(questionsLitGradeSchool.getQuestions(9));
    }

    private void LiteratureHighSchool(){
        question_1.setText(questionsLitHighSchool.getQuestions(0));
        question_2.setText(questionsLitHighSchool.getQuestions(1));
        question_3.setText(questionsLitHighSchool.getQuestions(2));
        question_4.setText(questionsLitHighSchool.getQuestions(3));
        question_5.setText(questionsLitHighSchool.getQuestions(4));
        question_6.setText(questionsLitHighSchool.getQuestions(5));
        question_7.setText(questionsLitHighSchool.getQuestions(6));
        question_8.setText(questionsLitHighSchool.getQuestions(7));
        question_9.setText(questionsLitHighSchool.getQuestions(8));
        question_10.setText(questionsLitHighSchool.getQuestions(9));

        answer_1.setText(questionsLitHighSchool.getQuestions(0));
        answer_2.setText(questionsLitHighSchool.getQuestions(1));
        answer_3.setText(questionsLitHighSchool.getQuestions(2));
        answer_4.setText(questionsLitHighSchool.getQuestions(3));
        answer_5.setText(questionsLitHighSchool.getQuestions(4));
        answer_6.setText(questionsLitHighSchool.getQuestions(5));
        answer_7.setText(questionsLitHighSchool.getQuestions(6));
        answer_8.setText(questionsLitHighSchool.getQuestions(7));
        answer_9.setText(questionsLitHighSchool.getQuestions(8));
        answer_10.setText(questionsLitHighSchool.getQuestions(9));
    }

    private void LiteratureCollege(){
        question_1.setText(questionsLitCollege.getQuestions(0));
        question_2.setText(questionsLitCollege.getQuestions(1));
        question_3.setText(questionsLitCollege.getQuestions(2));
        question_4.setText(questionsLitCollege.getQuestions(3));
        question_5.setText(questionsLitCollege.getQuestions(4));
        question_6.setText(questionsLitCollege.getQuestions(5));
        question_7.setText(questionsLitCollege.getQuestions(6));
        question_8.setText(questionsLitCollege.getQuestions(7));
        question_9.setText(questionsLitCollege.getQuestions(8));
        question_10.setText(questionsLitCollege.getQuestions(9));

        answer_1.setText(questionsLitCollege.getQuestions(0));
        answer_2.setText(questionsLitCollege.getQuestions(1));
        answer_3.setText(questionsLitCollege.getQuestions(2));
        answer_4.setText(questionsLitCollege.getQuestions(3));
        answer_5.setText(questionsLitCollege.getQuestions(4));
        answer_6.setText(questionsLitCollege.getQuestions(5));
        answer_7.setText(questionsLitCollege.getQuestions(6));
        answer_8.setText(questionsLitCollege.getQuestions(7));
        answer_9.setText(questionsLitCollege.getQuestions(8));
        answer_10.setText(questionsLitCollege.getQuestions(9));
    }

    private void MathGradeSchool(){
        question_1.setText(questionMath.getQuestions(0));
        question_2.setText(questionMath.getQuestions(1));
        question_3.setText(questionMath.getQuestions(2));
        question_4.setText(questionMath.getQuestions(3));
        question_5.setText(questionMath.getQuestions(4));
        question_6.setText(questionMath.getQuestions(5));
        question_7.setText(questionMath.getQuestions(6));
        question_8.setText(questionMath.getQuestions(7));
        question_9.setText(questionMath.getQuestions(8));
        question_10.setText(questionMath.getQuestions(9));

        answer_1.setText(questionMath.getQuestions(0));
        answer_2.setText(questionMath.getQuestions(1));
        answer_3.setText(questionMath.getQuestions(2));
        answer_4.setText(questionMath.getQuestions(3));
        answer_5.setText(questionMath.getQuestions(4));
        answer_6.setText(questionMath.getQuestions(5));
        answer_7.setText(questionMath.getQuestions(6));
        answer_8.setText(questionMath.getQuestions(7));
        answer_9.setText(questionMath.getQuestions(8));
        answer_10.setText(questionMath.getQuestions(9));
    }

    private void MathHighSchool(){
        question_1.setText(questionsMathHighSchool.getQuestions(0));
        question_2.setText(questionsMathHighSchool.getQuestions(1));
        question_3.setText(questionsMathHighSchool.getQuestions(2));
        question_4.setText(questionsMathHighSchool.getQuestions(3));
        question_5.setText(questionsMathHighSchool.getQuestions(4));
        question_6.setText(questionsMathHighSchool.getQuestions(5));
        question_7.setText(questionsMathHighSchool.getQuestions(6));
        question_8.setText(questionsMathHighSchool.getQuestions(7));
        question_9.setText(questionsMathHighSchool.getQuestions(8));
        question_10.setText(questionsMathHighSchool.getQuestions(9));

        answer_1.setText(questionsMathHighSchool.getQuestions(0));
        answer_2.setText(questionsMathHighSchool.getQuestions(1));
        answer_3.setText(questionsMathHighSchool.getQuestions(2));
        answer_4.setText(questionsMathHighSchool.getQuestions(3));
        answer_5.setText(questionsMathHighSchool.getQuestions(4));
        answer_6.setText(questionsMathHighSchool.getQuestions(5));
        answer_7.setText(questionsMathHighSchool.getQuestions(6));
        answer_8.setText(questionsMathHighSchool.getQuestions(7));
        answer_9.setText(questionsMathHighSchool.getQuestions(8));
        answer_10.setText(questionsMathHighSchool.getQuestions(9));
    }

    private void MathCollege(){
        question_1.setText(questionsMathCollege.getQuestions(0));
        question_2.setText(questionsMathCollege.getQuestions(1));
        question_3.setText(questionsMathCollege.getQuestions(2));
        question_4.setText(questionsMathCollege.getQuestions(3));
        question_5.setText(questionsMathCollege.getQuestions(4));
        question_6.setText(questionsMathCollege.getQuestions(5));
        question_7.setText(questionsMathCollege.getQuestions(6));
        question_8.setText(questionsMathCollege.getQuestions(7));
        question_9.setText(questionsMathCollege.getQuestions(8));
        question_10.setText(questionsMathCollege.getQuestions(9));

        answer_1.setText(questionsMathCollege.getQuestions(0));
        answer_2.setText(questionsMathCollege.getQuestions(1));
        answer_3.setText(questionsMathCollege.getQuestions(2));
        answer_4.setText(questionsMathCollege.getQuestions(3));
        answer_5.setText(questionsMathCollege.getQuestions(4));
        answer_6.setText(questionsMathCollege.getQuestions(5));
        answer_7.setText(questionsMathCollege.getQuestions(6));
        answer_8.setText(questionsMathCollege.getQuestions(7));
        answer_9.setText(questionsMathCollege.getQuestions(8));
        answer_10.setText(questionsMathCollege.getQuestions(9));
    }

    private void HistoryGradeSchool(){
        question_1.setText(questionHistory.getQuestions(0));
        question_2.setText(questionHistory.getQuestions(1));
        question_3.setText(questionHistory.getQuestions(2));
        question_4.setText(questionHistory.getQuestions(3));
        question_5.setText(questionHistory.getQuestions(4));
        question_6.setText(questionHistory.getQuestions(5));
        question_7.setText(questionHistory.getQuestions(6));
        question_8.setText(questionHistory.getQuestions(7));
        question_9.setText(questionHistory.getQuestions(8));
        question_10.setText(questionHistory.getQuestions(9));

        answer_1.setText(questionHistory.getQuestions(0));
        answer_2.setText(questionHistory.getQuestions(1));
        answer_3.setText(questionHistory.getQuestions(2));
        answer_4.setText(questionHistory.getQuestions(3));
        answer_5.setText(questionHistory.getQuestions(4));
        answer_6.setText(questionHistory.getQuestions(5));
        answer_7.setText(questionHistory.getQuestions(6));
        answer_8.setText(questionHistory.getQuestions(7));
        answer_9.setText(questionHistory.getQuestions(8));
        answer_10.setText(questionHistory.getQuestions(9));
    }

    private void HistoryHighSchool(){
        question_1.setText(questionsHistoryHighSchool.getQuestions(0));
        question_2.setText(questionsHistoryHighSchool.getQuestions(1));
        question_3.setText(questionsHistoryHighSchool.getQuestions(2));
        question_4.setText(questionsHistoryHighSchool.getQuestions(3));
        question_5.setText(questionsHistoryHighSchool.getQuestions(4));
        question_6.setText(questionsHistoryHighSchool.getQuestions(5));
        question_7.setText(questionsHistoryHighSchool.getQuestions(6));
        question_8.setText(questionsHistoryHighSchool.getQuestions(7));
        question_9.setText(questionsHistoryHighSchool.getQuestions(8));
        question_10.setText(questionsHistoryHighSchool.getQuestions(9));

        answer_1.setText(questionsHistoryHighSchool.getQuestions(0));
        answer_2.setText(questionsHistoryHighSchool.getQuestions(1));
        answer_3.setText(questionsHistoryHighSchool.getQuestions(2));
        answer_4.setText(questionsHistoryHighSchool.getQuestions(3));
        answer_5.setText(questionsHistoryHighSchool.getQuestions(4));
        answer_6.setText(questionsHistoryHighSchool.getQuestions(5));
        answer_7.setText(questionsHistoryHighSchool.getQuestions(6));
        answer_8.setText(questionsHistoryHighSchool.getQuestions(7));
        answer_9.setText(questionsHistoryHighSchool.getQuestions(8));
        answer_10.setText(questionsHistoryHighSchool.getQuestions(9));
    }

    private void HistoryCollege(){
        question_1.setText(questionsHistoryCollege.getQuestions(0));
        question_2.setText(questionsHistoryCollege.getQuestions(1));
        question_3.setText(questionsHistoryCollege.getQuestions(2));
        question_4.setText(questionsHistoryCollege.getQuestions(3));
        question_5.setText(questionsHistoryCollege.getQuestions(4));
        question_6.setText(questionsHistoryCollege.getQuestions(5));
        question_7.setText(questionsHistoryCollege.getQuestions(6));
        question_8.setText(questionsHistoryCollege.getQuestions(7));
        question_9.setText(questionsHistoryCollege.getQuestions(8));
        question_10.setText(questionsHistoryCollege.getQuestions(9));

        answer_1.setText(questionsHistoryCollege.getQuestions(0));
        answer_2.setText(questionsHistoryCollege.getQuestions(1));
        answer_3.setText(questionsHistoryCollege.getQuestions(2));
        answer_4.setText(questionsHistoryCollege.getQuestions(3));
        answer_5.setText(questionsHistoryCollege.getQuestions(4));
        answer_6.setText(questionsHistoryCollege.getQuestions(5));
        answer_7.setText(questionsHistoryCollege.getQuestions(6));
        answer_8.setText(questionsHistoryCollege.getQuestions(7));
        answer_9.setText(questionsHistoryCollege.getQuestions(8));
        answer_10.setText(questionsHistoryCollege.getQuestions(9));
    }
    
}