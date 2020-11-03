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
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.continueBtn:
                    Intent intent = new Intent(quiz_results.this, MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}