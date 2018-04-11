package com.example.davidokonji.tictac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity {
    DB_controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        controller = new DB_controller(this);

        TextView text = findViewById(R.id.name);
        TextView text2 = findViewById(R.id.score);

        //controller.insertData("david","10");
        controller.delete("Normal");
        controller.delete("*");
        controller.getData(text);
        controller.getData2(text2);

    }
    @Override
    public void onBackPressed() {
                Intent intent = new Intent(scoreActivity.this,MainActivity.class);
                scoreActivity.this.startActivity(intent);
    }
}
