//package com.example.davidokonji.tictac;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.GridView;
//import android.widget.Toast;
//
//public class hardActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hard);
//
//        GridView gridview = (GridView) findViewById(R.id.gridview);
//        gridview.setAdapter(new buttonAdapter(this));
//
//        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View v,
//                                    int position, long id) {
//                Toast.makeText(hardActivity.this, "" + position,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
package com.example.davidokonji.tictac;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hardActivity extends AppCompatActivity implements View.OnClickListener {

    boolean PLAYER_X = true;

    int TURN_COUNT = 0;
//    GridLayout grid;

    Button b00;
    Button b01;
    Button b02;
    Button b03;
    Button b04;

    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;

    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b24;

    Button b30;
    Button b31;
    Button b32;
    Button b33;
    Button b34;

    Button b40;
    Button b41;
    Button b42;
    Button b43;
    Button b44;

    Button Reset;

    TextView Info;

    int[][] boardStatus = new int[5][5];
    String Player_1;
    String Player_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        //Intent intent = getIntent();

        //String player_1 = intent.getStringExtra("PLAYER_1");
        //String player_2 = intent.getStringExtra("PLAYER_2");
        Player_1 = getIntent().getStringExtra("Player_1");
        Player_2 = getIntent().getStringExtra("Player_2");

        Toast.makeText(this, Player_1 + "'s Starts", Toast.LENGTH_SHORT).show();

        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b03 = findViewById(R.id.b03);
        b04 = findViewById(R.id.b04);


        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);

        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);

        b30 = findViewById(R.id.b30);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        b34 = findViewById(R.id.b34);

        b40 = findViewById(R.id.b40);
        b41 = findViewById(R.id.b41);
        b42 = findViewById(R.id.b42);
        b43 = findViewById(R.id.b43);
        b44 = findViewById(R.id.b44);

        Reset = findViewById(R.id.Reset);
        Info = findViewById(R.id.Info);

        Reset.setOnClickListener(this);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b03.setOnClickListener(this);
        b04.setOnClickListener(this);

        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);

        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);

        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);

        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);

        initializeBoardStatus();
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
                Intent intent = new Intent(hardActivity.this, modeActivity.class);
                hardActivity.this.startActivity(intent);
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

    @Override
    public void onClick(View view) {

        Player_1 = getIntent().getStringExtra("Player_1");
        Player_2 = getIntent().getStringExtra("Player_2");

        boolean resetButtonPressed = false;

        switch (view.getId()) {
            case R.id.b00:
                if (PLAYER_X) {
                    b00.setText("X");
                    boardStatus[0][0] = 1;
                } else {
                    b00.setText("O");
                    boardStatus[0][0] = 0;
                }
                b00.setEnabled(false);
                break;
            case R.id.b01:
                if (PLAYER_X) {
                    b01.setText("X");
                    boardStatus[0][1] = 1;
                } else {
                    b01.setText("O");
                    boardStatus[0][1] = 0;
                }
                b01.setEnabled(false);
                break;
            case R.id.b02:
                if (PLAYER_X) {
                    b02.setText("X");
                    boardStatus[0][2] = 1;
                } else {
                    b02.setText("O");
                    boardStatus[0][2] = 0;
                }
                b02.setEnabled(false);
                break;
            case R.id.b03:
                if (PLAYER_X) {
                    b03.setText("X");
                    boardStatus[0][3] = 1;
                } else {
                    b03.setText("O");
                    boardStatus[0][3] = 0;
                }
                b03.setEnabled(false);
                break;
            case R.id.b04:
                if (PLAYER_X) {
                    b04.setText("X");
                    boardStatus[0][4] = 1;
                } else {
                    b04.setText("O");
                    boardStatus[0][4] = 0;
                }
                b04.setEnabled(false);
                break;
            case R.id.b10:
                if (PLAYER_X) {
                    b10.setText("X");
                    boardStatus[1][0] = 1;
                } else {
                    b10.setText("O");
                    boardStatus[1][0] = 0;
                }
                b10.setEnabled(false);
                break;
            case R.id.b11:
                if (PLAYER_X) {
                    b11.setText("X");
                    boardStatus[1][1] = 1;
                } else {
                    b11.setText("O");
                    boardStatus[1][1] = 0;
                }
                b11.setEnabled(false);
                break;
            case R.id.b12:
                if (PLAYER_X) {
                    b12.setText("X");
                    boardStatus[1][2] = 1;
                } else {
                    b12.setText("O");
                    boardStatus[1][2] = 0;
                }
                b12.setEnabled(false);
                break;
            case R.id.b13:
                if (PLAYER_X) {
                    b13.setText("X");
                    boardStatus[1][3] = 1;
                } else {
                    b13.setText("O");
                    boardStatus[1][3] = 0;
                }
                b13.setEnabled(false);
                break;
            case R.id.b14:
                if (PLAYER_X) {
                    b14.setText("X");
                    boardStatus[1][4] = 1;
                } else {
                    b14.setText("O");
                    boardStatus[1][4] = 0;
                }
                b14.setEnabled(false);
                break;
            case R.id.b20:
                if (PLAYER_X) {
                    b20.setText("X");
                    boardStatus[2][0] = 1;
                } else {
                    b20.setText("O");
                    boardStatus[2][0] = 0;
                }
                b20.setEnabled(false);
                break;
            case R.id.b21:
                if (PLAYER_X) {
                    b21.setText("X");
                    boardStatus[2][1] = 1;
                } else {
                    b21.setText("O");
                    boardStatus[2][1] = 0;
                }
                b21.setEnabled(false);
                break;
            case R.id.b22:
                if (PLAYER_X) {
                    b22.setText("X");
                    boardStatus[2][2] = 1;
                } else {
                    b22.setText("O");
                    boardStatus[2][2] = 0;
                }
                b22.setEnabled(false);
                break;
            case R.id.b23:
                if (PLAYER_X) {
                    b23.setText("X");
                    boardStatus[2][3] = 1;
                } else {
                    b23.setText("O");
                    boardStatus[2][3] = 0;
                }
                b23.setEnabled(false);
                break;
            case R.id.b24:
                if (PLAYER_X) {
                    b24.setText("X");
                    boardStatus[2][4] = 1;
                } else {
                    b24.setText("O");
                    boardStatus[2][4] = 0;
                }
                b24.setEnabled(false);
                break;
            case R.id.b30:
                if (PLAYER_X) {
                    b30.setText("X");
                    boardStatus[3][0] = 1;
                } else {
                    b30.setText("O");
                    boardStatus[3][0] = 0;
                }
                b30.setEnabled(false);
                break;
            case R.id.b31:
                if (PLAYER_X) {
                    b31.setText("X");
                    boardStatus[3][1] = 1;
                } else {
                    b31.setText("O");
                    boardStatus[3][1] = 0;
                }
                b31.setEnabled(false);
                break;
            case R.id.b32:
                if (PLAYER_X) {
                    b32.setText("X");
                    boardStatus[3][2] = 1;
                } else {
                    b32.setText("O");
                    boardStatus[3][2] = 0;
                }
                b32.setEnabled(false);
                break;
            case R.id.b33:
                if (PLAYER_X) {
                    b33.setText("X");
                    boardStatus[3][3] = 1;
                } else {
                    b33.setText("O");
                    boardStatus[3][3] = 0;
                }
                b33.setEnabled(false);
                break;
            case R.id.b34:
                if (PLAYER_X) {
                    b34.setText("X");
                    boardStatus[3][4] = 1;
                } else {
                    b34.setText("O");
                    boardStatus[3][4] = 0;
                }
                b34.setEnabled(false);
                break;
            case R.id.b40:
                if (PLAYER_X) {
                    b40.setText("X");
                    boardStatus[4][0] = 1;
                } else {
                    b40.setText("O");
                    boardStatus[4][0] = 0;
                }
                b40.setEnabled(false);
                break;
            case R.id.b41:
                if (PLAYER_X) {
                    b41.setText("X");
                    boardStatus[4][1] = 1;
                } else {
                    b41.setText("O");
                    boardStatus[4][1] = 0;
                }
                b41.setEnabled(false);
                break;
            case R.id.b42:
                if (PLAYER_X) {
                    b42.setText("X");
                    boardStatus[4][2] = 1;
                } else {
                    b42.setText("O");
                    boardStatus[4][2] = 0;
                }
                b42.setEnabled(false);
                break;
            case R.id.b43:
                if (PLAYER_X) {
                    b43.setText("X");
                    boardStatus[4][3] = 1;
                } else {
                    b43.setText("O");
                    boardStatus[4][3] = 0;
                }
                b43.setEnabled(false);
                break;
            case R.id.b44:
                if (PLAYER_X) {
                    b44.setText("X");
                    boardStatus[4][4] = 1;
                } else {
                    b44.setText("O");
                    boardStatus[4][4] = 0;
                }
                b44.setEnabled(false);
                break;
            case R.id.Reset:
                resetButtonPressed = true;
                break;

            default:
                break;

        }
        if (resetButtonPressed) {
            resetBoard();
        } else {
            TURN_COUNT++;
            PLAYER_X = !PLAYER_X;

            if (TURN_COUNT == 0) {
                setInfo(Player_1 + "'s turn");
            }


            if (PLAYER_X) {
                setInfo(Player_1 + "'s turn");
            } else {
                setInfo(Player_2 + "'s turn");

            }

            if (TURN_COUNT == 25) {
                result("Game Draw");
            }

            checkWinner();
        }
    }

    private void checkWinner() {
        Player_1 = getIntent().getStringExtra("Player_1");
        Player_2 = getIntent().getStringExtra("Player_2");

        //Horizontal --- rows checking
        for (int i = 0; i < 5; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2] && boardStatus[i][0] == boardStatus[i][3] && boardStatus[i][0] == boardStatus[i][4]) {
                if (boardStatus[i][0] == 1) {
                    result(Player_1 + " wins \n" + (i + 1) + " row");
                    break;
                } else if (boardStatus[i][0] == 0) {
                    result(Player_2 + " wins\n" + (i + 1) + " row");
                    break;
                }
            }
        }

        //Vertical --- columns checking
        for (int i = 0; i < 5; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i] && boardStatus[0][i] == boardStatus[3][i] && boardStatus[0][i] == boardStatus[4][i]) {
                if (boardStatus[0][i] == 1) {
                    result(Player_1 + " wins \n" + (i + 1) + " column");
                    break;
                } else if (boardStatus[0][i] == 0) {
                    result(Player_2 + " wins \n" + (i + 1) + " column");
                    break;
                }
            }
        }

        //First diagonal check
        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2] && boardStatus[0][0] == boardStatus[3][3] && boardStatus[0][0] == boardStatus[4][4]) {
            if (boardStatus[0][0] == 1) {
                result(Player_1 + " wins \n First Diagonal");
            } else if (boardStatus[0][0] == 0) {
                result(Player_2 + " wins \n First Diagonal");
            }
        }

        //Second diagonal check
        if (boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0] && boardStatus[0][2] == boardStatus[3][0] && boardStatus[0][2] == boardStatus[4][0]) {
            if (boardStatus[0][2] == 1) {
                result(Player_1 + " wins \n Second Diagonal");
            } else if (boardStatus[0][2] == 0) {
                result(Player_2 + " wins \n Second Diagonal");
            }
        }
    }

    private void enableAllBoxes(boolean value) {
        b00.setEnabled(value);
        b01.setEnabled(value);
        b02.setEnabled(value);
        b03.setEnabled(value);
        b04.setEnabled(value);

        b10.setEnabled(value);
        b11.setEnabled(value);
        b12.setEnabled(value);
        b13.setEnabled(value);
        b14.setEnabled(value);

        b20.setEnabled(value);
        b21.setEnabled(value);
        b22.setEnabled(value);
        b23.setEnabled(value);
        b24.setEnabled(value);

        b30.setEnabled(value);
        b31.setEnabled(value);
        b32.setEnabled(value);
        b33.setEnabled(value);
        b34.setEnabled(value);

        b40.setEnabled(value);
        b41.setEnabled(value);
        b42.setEnabled(value);
        b43.setEnabled(value);
        b44.setEnabled(value);
    }

    private void result(String winner) {

        setInfo(winner);
        enableAllBoxes(false);
    }

    private void resetBoard() {
        b00.setText("");
        b01.setText("");
        b02.setText("");
        b03.setText("");
        b04.setText("");

        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");

        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");

        b30.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        b34.setText("");

        b40.setText("");
        b41.setText("");
        b42.setText("");
        b43.setText("");
        b44.setText("");

        enableAllBoxes(true);

        PLAYER_X = true;
        TURN_COUNT = 0;

        initializeBoardStatus();

        setInfo("Play Again");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    private void setInfo(String text) {
        Info.setText(text);
    }

    private void initializeBoardStatus() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boardStatus[i][j] = -1;
            }
        }

    }
}

