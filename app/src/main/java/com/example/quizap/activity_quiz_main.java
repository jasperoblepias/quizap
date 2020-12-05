package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_quiz_main extends AppCompatActivity {

    private questionsLitGradeSchool questionsLitGradeSchool = new questionsLitGradeSchool();
    private questionsLitHighSchool questionsLitHighSchool = new questionsLitHighSchool();
    private questionsLitCollege questionsLitCollege = new questionsLitCollege();

    private questionsMathGradeSchool questionMath = new questionsMathGradeSchool();
    private questionsMathHighSchool questionsMathHighSchool = new questionsMathHighSchool();
    private questionsMathCollege questionsMathCollege = new questionsMathCollege();

    private questionsHistoryGradeSchool questionHistory = new questionsHistoryGradeSchool();
    private questionsHistoryHighSchool questionsHistoryHighSchool = new questionsHistoryHighSchool();
    private questionsHistoryCollege questionsHistoryCollege = new questionsHistoryCollege();



    private TextView mQuestions;
    private TextView mScoreView;
    private TextView questionNumberText;
    private TextView subjectName;
    private Button getChoiceA;
    private Button getChoiceB;
    private Button getChoiceC;
    private Button getChoiceD;
    private String mAnswer;
    private int questionNumber;
    private int mScore = 0;
    private int questionNumberTextInt = 0;

    int LiteratureGradeSchool = 100;
    int LiteratureHighSchool = 101;
    int LiteratureCollege = 102;

    int MathGradeSchool = 200;
    int MathHighSchool = 201;
    int MathCollege = 202;

    int HistoryGradeSchool = 300;
    int HistoryHighSchool = 301;
    int HistoryCollege = 302;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        mScoreView = (TextView)findViewById(R.id.score);
        mQuestions = (TextView)findViewById(R.id.question);
        getChoiceA = (Button)findViewById(R.id.buttonChoiceA);
        getChoiceB = (Button)findViewById(R.id.buttonChoiceB);
        getChoiceC = (Button)findViewById(R.id.buttonChoiceC);
        getChoiceD = (Button)findViewById(R.id.buttonChoiceD);
        questionNumberText = (TextView)findViewById(R.id.numberQuestionText);
        subjectName = (TextView)findViewById(R.id.subjectName);


        Bundle bundle = getIntent().getExtras();
        int level_code = bundle.getInt("number");


        switch (level_code){
            //literature subject
            case 100:
                subjectName.setText("Literature");
                LiteratureGradeSchool();
                break;
            case 101:
                subjectName.setText("Literature");
                LiteratureHighSchool();
                break;
            case 102:
                subjectName.setText("Literature");
                LiteratureCollege();
                break;
            //math subject
            case 200:
                subjectName.setText("Math");
                MathGradeSchool();
                break;
            case 201:
                subjectName.setText("Math");
                MathHighSchool();
                break;
            case 202:
                subjectName.setText("Math");
                MathCollege();
                break;
            //history subject
            case 300:
                subjectName.setText("World History");
                HistoryGradeSchool();
                break;
            case 301:
                subjectName.setText("World History");
                HistoryHighSchool();
                break;
            case 302:
                subjectName.setText("World History");
                HistoryCollege();
                break;
        }

    }

    //****************************************************************************
    //*********************** Literature Grade School ****************************
    //****************************************************************************

    private void LiteratureGradeSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }

    //****************************************************************************
    //*********************** Literature High School ****************************
    //****************************************************************************

    private void LiteratureHighSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitHighSchool.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitHighSchool.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionsLitHighSchool.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitHighSchool.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }

    //****************************************************************************
    //************************** Literature College ******************************
    //****************************************************************************

    private void LiteratureCollege(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitCollege.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitCollege.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionsLitCollege.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitCollege.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",LiteratureCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }

    //****************************************************************************
    //***************************** Math Grade School ****************************
    //****************************************************************************


    private void MathGradeSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionMath.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }

    //****************************************************************************
    //***************************** Math High School *****************************
    //****************************************************************************

    private void MathHighSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionMath.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsLitGradeSchool.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }
    //****************************************************************************
    //****************************** Math College ********************************
    //****************************************************************************

    private void MathCollege(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionsMathCollege.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsMathCollege.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsMathCollege.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsMathCollege.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",MathCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
    }

    //****************************************************************************
    //**************************History Grade School *****************************
    //****************************************************************************

    private void HistoryGradeSchool() {
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();

        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionHistory.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionHistory.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionHistory.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionHistory.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryGradeSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });
        
    }

    //****************************************************************************
    //*************************** History Highschool *****************************
    //****************************************************************************


    private void HistoryHighSchool() {
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();

        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryHighSchool.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryHighSchool.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryHighSchool.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryHighSchool.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryHighSchool);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

    }

    //****************************************************************************
    //*************************** History College ********************************
    //****************************************************************************


    private void HistoryCollege() {
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();

        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryCollege.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryCollege.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryCollege.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionsHistoryCollege.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        bundle.putInt("level",HistoryCollege);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestion();
                }
            }
        });

    }

    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }

    private void updateQuestionNumber(int point){ questionNumberText.setText(" "+questionNumberTextInt); }

//    private void updatequestionsLitGradeSchool() {
//
//        mQuestions.setText(questionsLitGradeSchool.getQuestions(questionNumber));
//        getChoiceA.setText(questionsLitGradeSchool.getChoice1(questionNumber));
//        getChoiceB.setText(questionsLitGradeSchool.getChoice2(questionNumber));
//        getChoiceC.setText(questionsLitGradeSchool.getChoice3(questionNumber));
//        getChoiceD.setText(questionsLitGradeSchool.getChoice4(questionNumber));
//        mAnswer = questionsLitGradeSchool.getCorrectAnswer(questionNumber);
//        questionNumber++;
//    }
//
//    private void updateQuestionMath() {
//        mQuestions.setText(questionMath.getQuestions(questionNumber));
//        getChoiceA.setText(questionMath.getChoice1(questionNumber));
//        getChoiceB.setText(questionMath.getChoice2(questionNumber));
//        getChoiceC.setText(questionMath.getChoice3(questionNumber));
//        getChoiceD.setText(questionMath.getChoice4(questionNumber));
//        mAnswer = questionMath.getCorrectAnswer(questionNumber);
//        questionNumber++;
//    }
//
//    private void updateQuestionHistory() {
//        mQuestions.setText(questionHistory.getQuestions(questionNumber));
//        getChoiceA.setText(questionHistory.getChoice1(questionNumber));
//        getChoiceB.setText(questionHistory.getChoice2(questionNumber));
//        getChoiceC.setText(questionHistory.getChoice3(questionNumber));
//        getChoiceD.setText(questionHistory.getChoice4(questionNumber));
//        mAnswer = questionHistory.getCorrectAnswer(questionNumber);
//        questionNumber++;
//    }

    private void updateQuestion(){

        Bundle bundle = getIntent().getExtras();
        int level_code = bundle.getInt("number");

        switch(level_code){
            case 100:
                mQuestions.setText(questionsLitGradeSchool.getQuestions(questionNumber));
                getChoiceA.setText(questionsLitGradeSchool.getChoice1(questionNumber));
                getChoiceB.setText(questionsLitGradeSchool.getChoice2(questionNumber));
                getChoiceC.setText(questionsLitGradeSchool.getChoice3(questionNumber));
                getChoiceD.setText(questionsLitGradeSchool.getChoice4(questionNumber));
                mAnswer = questionsLitGradeSchool.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 101:
                mQuestions.setText(questionsLitHighSchool.getQuestions(questionNumber));
                getChoiceA.setText(questionsLitHighSchool.getChoice1(questionNumber));
                getChoiceB.setText(questionsLitHighSchool.getChoice2(questionNumber));
                getChoiceC.setText(questionsLitHighSchool.getChoice3(questionNumber));
                getChoiceD.setText(questionsLitHighSchool.getChoice4(questionNumber));
                mAnswer = questionsLitHighSchool.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 102:
                mQuestions.setText(questionsLitCollege.getQuestions(questionNumber));
                getChoiceA.setText(questionsLitCollege.getChoice1(questionNumber));
                getChoiceB.setText(questionsLitCollege.getChoice2(questionNumber));
                getChoiceC.setText(questionsLitCollege.getChoice3(questionNumber));
                getChoiceD.setText(questionsLitCollege.getChoice4(questionNumber));
                mAnswer = questionsLitCollege.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;


            case 200:
                mQuestions.setText(questionMath.getQuestions(questionNumber));
                getChoiceA.setText(questionMath.getChoice1(questionNumber));
                getChoiceB.setText(questionMath.getChoice2(questionNumber));
                getChoiceC.setText(questionMath.getChoice3(questionNumber));
                getChoiceD.setText(questionMath.getChoice4(questionNumber));
                mAnswer = questionMath.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 201:
                mQuestions.setText(questionsMathHighSchool.getQuestions(questionNumber));
                getChoiceA.setText(questionsMathHighSchool.getChoice1(questionNumber));
                getChoiceB.setText(questionsMathHighSchool.getChoice2(questionNumber));
                getChoiceC.setText(questionsMathHighSchool.getChoice3(questionNumber));
                getChoiceD.setText(questionsMathHighSchool.getChoice4(questionNumber));
                mAnswer = questionsMathHighSchool.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 202:
                mQuestions.setText(questionsMathCollege.getQuestions(questionNumber));
                getChoiceA.setText(questionsMathCollege.getChoice1(questionNumber));
                getChoiceB.setText(questionsMathCollege.getChoice2(questionNumber));
                getChoiceC.setText(questionsMathCollege.getChoice3(questionNumber));
                getChoiceD.setText(questionsMathCollege.getChoice4(questionNumber));
                mAnswer = questionsMathCollege.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;


            case 300:
                mQuestions.setText(questionHistory.getQuestions(questionNumber));
                getChoiceA.setText(questionHistory.getChoice1(questionNumber));
                getChoiceB.setText(questionHistory.getChoice2(questionNumber));
                getChoiceC.setText(questionHistory.getChoice3(questionNumber));
                getChoiceD.setText(questionHistory.getChoice4(questionNumber));
                mAnswer = questionHistory.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 301:
                mQuestions.setText(questionsHistoryHighSchool.getQuestions(questionNumber));
                getChoiceA.setText(questionsHistoryHighSchool.getChoice1(questionNumber));
                getChoiceB.setText(questionsHistoryHighSchool.getChoice2(questionNumber));
                getChoiceC.setText(questionsHistoryHighSchool.getChoice3(questionNumber));
                getChoiceD.setText(questionsHistoryHighSchool.getChoice4(questionNumber));
                mAnswer = questionsHistoryHighSchool.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;

            case 302:
                mQuestions.setText(questionsHistoryCollege.getQuestions(questionNumber));
                getChoiceA.setText(questionsHistoryCollege.getChoice1(questionNumber));
                getChoiceB.setText(questionsHistoryCollege.getChoice2(questionNumber));
                getChoiceC.setText(questionsHistoryCollege.getChoice3(questionNumber));
                getChoiceD.setText(questionsHistoryCollege.getChoice4(questionNumber));
                mAnswer = questionsHistoryCollege.getCorrectAnswer(questionNumber);
                questionNumber++;
                break;
        }
    }

}

