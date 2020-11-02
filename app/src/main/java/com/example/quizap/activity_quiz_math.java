package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_quiz_math extends AppCompatActivity {


    private questionsMathGradeSchool questions = new questionsMathGradeSchool();
    private TextView mQuestions;
    private TextView mScoreView;
    private Button getChoiceA;
    private Button getChoiceB;
    private Button getChoiceC;
    private Button getChoiceD;
    private String mAnswer;
    private int questionNumber;
    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_math);

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

        updateQuestion();

        getChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questions.mQuestions.length){
                    if(getChoiceA.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);

                        Intent intent = new Intent(activity_quiz_math.this, literature_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_math.this.finish();
                        startActivity(intent);
                    }

                }

                else if(getChoiceA.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }

            }
        });

        getChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questions.mQuestions.length){
                    if(getChoiceB.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_math.this, literature_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_math.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceB.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }

            }
        });

        getChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questions.mQuestions.length){
                    if(getChoiceC.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_math.this, literature_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_math.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceC.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });

        getChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionNumber == questions.mQuestions.length){
                    if(getChoiceD.getText() == mAnswer){
                        mScore = mScore+1;
                        updateScore(mScore);
                        Intent intent = new Intent(activity_quiz_math.this, literature_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_math.this.finish();
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(activity_quiz_math.this, literature_results.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        intent.putExtras(bundle);
                        activity_quiz_math.this.finish();
                        startActivity(intent);
                    }
                }

                else if(getChoiceD.getText() == mAnswer){
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                }
                else {
                    updateQuestion();
                }
            }
        });

    }

    private void updateScore(int point){
        mScoreView.setText("Score"+mScore);
    }

    private void updateQuestion() {
        mQuestions.setText(questions.getQuestions(questionNumber));
        getChoiceA.setText(questions.getChoice1(questionNumber));
        getChoiceB.setText(questions.getChoice2(questionNumber));
        getChoiceC.setText(questions.getChoice3(questionNumber));
        getChoiceD.setText(questions.getChoice4(questionNumber));

        mAnswer = questions.getCorrectAnswer(questionNumber);
        questionNumber++;
    }
}