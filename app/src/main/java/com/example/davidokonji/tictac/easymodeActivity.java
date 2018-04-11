package com.example.davidokonji.tictac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class easymodeActivity extends AppCompatActivity {

    //EditText player_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easymode);

        //player_1 = findViewById(R.id.Player1);

        final Button easy = findViewById(R.id.easy);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String Player_1 =""+ player_1.getText().toString();

                Intent intent = new Intent(easymodeActivity.this,single_player_easy.class);

                //intent.putExtra("Player_1",Player_1);

                easymodeActivity.this.startActivity(intent);
            }
        });

        final Button hard = findViewById(R.id.hard);

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String Player_1 =""+ player_1.getText().toString();

                Intent intent = new Intent(easymodeActivity.this, single_player_difficult.class);
                //intent.putExtra("Player_1",Player_1);

                easymodeActivity.this.startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(easymodeActivity.this,select_play.class);
        easymodeActivity.this.startActivity(intent);
    }
}

