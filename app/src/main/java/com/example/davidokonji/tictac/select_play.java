package com.example.davidokonji.tictac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_play);

        final Button single = findViewById(R.id.single);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Default Mode",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(select_play.this,easymodeActivity.class);
                select_play.this.startActivity(intent);
            }
        });

        final Button multi = findViewById(R.id.multi);

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select_play.this,modeActivity.class);
                select_play.this.startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(select_play.this,MainActivity.class);
        select_play.this.startActivity(intent);
    }
}
