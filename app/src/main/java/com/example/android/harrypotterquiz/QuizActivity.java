package com.example.android.harrypotterquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    Button option1,option2,option3;

    TextView score,question;

    private String ans;
    private Questions ques=new Questions();
    private int scor=0;

    private int qno=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        option1=(Button) findViewById(R.id.opt1);
        option2=(Button) findViewById(R.id.opt2);
        option3=(Button) findViewById(R.id.opt3);

        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);

        score.setText("Score :"+scor);

        updateQuestion(qno);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.getText()==ans){
                    scor++;
                    score.setText("score: "+scor);
                    updateQuestion(qno);
                }
                else {
                    gameOver();
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option2.getText()==ans){
                    scor++;
                    score.setText("score: "+scor);
                    updateQuestion(qno);
                }
                else {
                    gameOver();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option3.getText()==ans){
                    scor++;
                    score.setText("score: "+scor);
                    updateQuestion(qno);
                }
                else {
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int num){
        if(qno==10){
            gameWin();
        }
        else {
            question.setText(ques.getQuestion(num));
            option1.setText(ques.getOption1(num));
            option2.setText(ques.getOption2(num));
            option3.setText(ques.getOption3(num));

            ans = ques.getAnswer(num);
            qno++;
        }
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is "+scor+".")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        } )
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

    private void gameWin(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Congratulations You Win!")
                .setCancelable(false)
                .setPositiveButton("PLAY AGAIN",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        } )
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
