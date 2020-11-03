package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_quiz_main extends AppCompatActivity {

    private questionsLitGradeSchool questionLit = new questionsLitGradeSchool();
    private questionsMathGradeSchool questionMath = new questionsMathGradeSchool();
    private questionsHistoryGradeSchool questionHistory = new questionsHistoryGradeSchool();
    private TextView mQuestions;
    private TextView mScoreView;
    private TextView questionNumberText;
    private Button getChoiceA;
    private Button getChoiceB;
    private Button getChoiceC;
    private Button getChoiceD;
    private String mAnswer;
    private int questionNumber;
    private int mScore = 0;
    private int questionNumberTextInt = 0;



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


        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("number");

        if(number == 100){
            LiteratureGradeSchool();
        }
        else if(number == 200){
            MathGradeSchool();
        }
        else if(number == 300){
            HistoryGradeSchool();
        }

    }


    private void LiteratureGradeSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestion();


        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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

    //***************************** Math Grade School ****************************

    private void MathGradeSchool(){
        questionNumberTextInt = questionNumberTextInt+1;
        updateQuestionMath();


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
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                    updateQuestionMath();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestionMath();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                    updateQuestionMath();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestionMath();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                    updateQuestionMath();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestionMath();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questionLit.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
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
                    updateQuestionMath();
                }
                else {
                    questionNumberTextInt = questionNumberTextInt+1;
                    updateQuestionNumber(questionNumberTextInt);
                    updateQuestionMath();
                }
            }
        });
    }


    // **************************************** History Grade School ********************************************


    private void HistoryGradeSchool() {

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
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestionHistory();
                }
                else {
                    updateQuestionHistory();
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
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestionHistory();
                }
                else {
                    updateQuestionHistory();
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
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestionHistory();
                }
                else {
                    updateQuestionHistory();
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
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_main.this, quiz_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_main.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestionHistory();
                }
                else {
                    updateQuestionHistory();
                }
            }
        });
        
    }
   

    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }
    private void updateQuestionNumber(int point){ questionNumberText.setText(" "+questionNumberTextInt); }
    private void updateQuestion() {
        mQuestions.setText(questionLit.getQuestions(questionNumber));
        getChoiceA.setText(questionLit.getChoice1(questionNumber));
        getChoiceB.setText(questionLit.getChoice2(questionNumber));
        getChoiceC.setText(questionLit.getChoice3(questionNumber));
        getChoiceD.setText(questionLit.getChoice4(questionNumber));
        mAnswer = questionLit.getCorrectAnswer(questionNumber);
        questionNumber++;
    }

    private void updateQuestionMath() {
        mQuestions.setText(questionMath.getQuestions(questionNumber));
        getChoiceA.setText(questionMath.getChoice1(questionNumber));
        getChoiceB.setText(questionMath.getChoice2(questionNumber));
        getChoiceC.setText(questionMath.getChoice3(questionNumber));
        getChoiceD.setText(questionMath.getChoice4(questionNumber));
        mAnswer = questionMath.getCorrectAnswer(questionNumber);
        questionNumber++;
    }

    private void updateQuestionHistory() {
        mQuestions.setText(questionHistory.getQuestions(questionNumber));
        getChoiceA.setText(questionHistory.getChoice1(questionNumber));
        getChoiceB.setText(questionHistory.getChoice2(questionNumber));
        getChoiceC.setText(questionHistory.getChoice3(questionNumber));
        getChoiceD.setText(questionHistory.getChoice4(questionNumber));
        mAnswer = questionHistory.getCorrectAnswer(questionNumber);
        questionNumber++;
    }
}