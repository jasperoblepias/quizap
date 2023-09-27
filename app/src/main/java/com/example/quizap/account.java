package com.example.quizap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class account extends AppCompatActivity {


    RecyclerView recyclerView;
    Button  ok_btn;
    Button testing;


    MyDatabaseHelper myDB;
    ArrayList<String> user_id, user_name, user_score;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);


        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        DisplayMetrics dm_hamburger = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm_hamburger);

        int width = dm_hamburger.widthPixels;
        int height = dm_hamburger.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        recyclerView = findViewById(R.id.recyclerView);
        ok_btn = findViewById(R.id.ok_btn);


        myDB = new MyDatabaseHelper(account.this);
        user_id = new ArrayList<>();
        user_name = new ArrayList<>();
        user_score = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(account.this, user_id, user_name, user_score);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(account.this));

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(account.this, activity_hamburger.class);
                account.this.finish();
                startActivity(intent);
            }
        });

    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
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