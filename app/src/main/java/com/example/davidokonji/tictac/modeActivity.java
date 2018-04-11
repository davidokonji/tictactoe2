package com.example.davidokonji.tictac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class modeActivity extends AppCompatActivity {

    EditText player_1;
    EditText player_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        player_1 = findViewById(R.id.Player1);
        player_2 = findViewById(R.id.Player2);

        final Button normal = findViewById(R.id.normal);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Player_1 =""+ player_1.getText().toString();
                String Player_2 =""+ player_2.getText().toString();

                Intent intent = new Intent(modeActivity.this,Normal.class);

                intent.putExtra("Player_1",Player_1);
                intent.putExtra("Player_2",Player_2);

                modeActivity.this.startActivity(intent);
            }
        });

        final Button medium = findViewById(R.id.meduim);

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Player_1 =""+ player_1.getText().toString();
                String Player_2 =""+ player_2.getText().toString();

                Intent intent = new Intent(modeActivity.this, mediumActivity.class);
                intent.putExtra("Player_1",Player_1);
                intent.putExtra("Player_2",Player_2);

                modeActivity.this.startActivity(intent);
            }
        });
        final Button hard = findViewById(R.id.hard);

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Player_1 =""+ player_1.getText().toString();
                String Player_2 =""+ player_2.getText().toString();

                Intent intent = new Intent(modeActivity.this, hardActivity.class);
                intent.putExtra("Player_1",Player_1);
                intent.putExtra("Player_2",Player_2);

                modeActivity.this.startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(modeActivity.this,select_play.class);
        modeActivity.this.startActivity(intent);
    }
}
