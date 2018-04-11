package com.example.davidokonji.tictac;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class single_player_easy extends AppCompatActivity {

    public static Activity act_1e;
    //String Player_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        act_1e = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_easy);
        //Player_1 = getIntent().getStringExtra("Player_1");
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Cancel current game?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                Intent intent = new Intent(single_player_easy.this,select_play.class);
                single_player_easy.this.startActivity(intent);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
