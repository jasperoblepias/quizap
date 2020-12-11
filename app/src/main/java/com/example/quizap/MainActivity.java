package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyDatabaseHelper myDB;

    ArrayList<String> user_id;
    ArrayList<String> user_name;
    ArrayList<String> user_score;
    RecyclerView recyclerView;
    CustomAdpater2 CustomAdpater2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        caseButtons();

        data_read();
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

            TextView score_a = (TextView) findViewById(R.id.user_score_txt);

            int score = Integer.valueOf(score_a.getText().toString());

            switch (view.getId()){
                case R.id.litButton:
                    Intent intent_lit = new Intent(MainActivity.this, activity_literature.class);
                    Bundle bundle_lit = new Bundle();
                    bundle_lit.putInt("score", score);
                    intent_lit.putExtras(bundle_lit);
                    startActivity(intent_lit);
                    break;
                case R.id.historyButton:
                    Intent intent_his = new Intent(MainActivity.this, activity_worldhistory.class);
                    Bundle bundle_his = new Bundle();
                    bundle_his.putInt("score", score);
                    intent_his.putExtras(bundle_his);
                    startActivity(intent_his);
                    break;
                case R.id.mathButton:
                    Intent intent_math = new Intent(MainActivity.this, activity_math.class);
                    Bundle bundle_math = new Bundle();
                    bundle_math.putInt("score", score);
                    intent_math.putExtras(bundle_math);
                    startActivity(intent_math);
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

    void data_read(){
        recyclerView = findViewById(R.id.recyclerView);

        myDB = new MyDatabaseHelper(MainActivity.this);
        user_id = new ArrayList<>();
        user_name = new ArrayList<>();
        user_score = new ArrayList<>();

        storeDataInArrays();

        CustomAdpater2 = new CustomAdpater2(MainActivity.this, user_id, user_name, user_score);
        recyclerView.setAdapter(CustomAdpater2);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readFirst();
        if(cursor.getCount() == 0){
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                user_id.add(cursor.getString(0));
                user_name.add(cursor.getString(1));
                user_score.add(cursor.getString(2));
            }
        }
    }

}