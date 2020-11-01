package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        caseButtons();
    }

    public void caseButtons(){
        findViewById(R.id.litButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.historyButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.mathButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.geographyButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.botanyButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.zoologyButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.programmingButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.help_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.hamburger).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.litButton:
                    Intent lit = new Intent(MainActivity.this, activity_literature.class);
                    startActivity(lit);
                    break;
                case R.id.historyButton:
                    Intent his = new Intent(MainActivity.this, activity_worldhistory.class);
                    startActivity(his);
                    break;
                case R.id.mathButton:
                    Intent math = new Intent(MainActivity.this, activity_math.class);
                    startActivity(math);
                    break;
                case R.id.geographyButton:
                    Intent geo = new Intent(MainActivity.this, activity_geography.class);
                    startActivity(geo);
                    break;
                case R.id.botanyButton:
                    Intent bot = new Intent(MainActivity.this, activity_botany.class);
                    startActivity(bot);
                    break;
                case R.id.zoologyButton:
                    Intent zoo = new Intent(MainActivity.this, activity_zoology.class);
                    startActivity(zoo);
                    break;
                case R.id.programmingButton:
                    Intent prog = new Intent(MainActivity.this, activity_programming.class);
                    startActivity(prog);
                    break;
                case R.id.help_button:
                    Intent help = new Intent(MainActivity.this, help_button.class);
                    startActivity(help);
                    break;
                case R.id.hamburger:
                    Intent ham = new Intent(MainActivity.this, activity_hamburger.class);
                    startActivity(ham);
                    break;
            }
        }
    };
}