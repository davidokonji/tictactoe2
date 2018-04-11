package com.example.davidokonji.tictac;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start = findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Default Mode",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,select_play.class);
                MainActivity.this.startActivity(intent);
            }
        });
        final Button exit = findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(MainActivity.this);

                dlgAlert.setMessage("Do you want to quit game?");
                dlgAlert.setTitle("Quit Game");

                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                System.exit(0);
                            }
                        });
                dlgAlert.create().show();
            }
        });
        final Button scoreboard = findViewById(R.id.scoreboard);
        scoreboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,scoreActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        final Button about = findViewById(R.id.AboutBtn);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Welcome to my Tic Tac Game \n The scoreboard takes record of " +
                        "  every round played the game. Enjoy",Toast.LENGTH_LONG).show();

            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to quit game?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
                System.exit(0);
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
