package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create_account extends AppCompatActivity {

    EditText username;
    Button ok_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        DisplayMetrics dm_hamburger = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm_hamburger);

        int width = dm_hamburger.widthPixels;
        int height = dm_hamburger.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        username = findViewById(R.id.username);
        ok_btn = findViewById(R.id.ok_btn);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(create_account.this);
                myDB.addName(username.getText().toString().trim(),0);

                Intent intent = new Intent(create_account.this, activity_hamburger.class);
                create_account.this.finish();

                startActivity(intent);
            }
        });
    }
}


