package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private String startGame="X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount=0,oCount=0,i=0;
    private TextView scorex,scoreo;
    private Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.buttonImage1);
        button2=findViewById(R.id.buttonImage2);
        button3=findViewById(R.id.buttonImage3);
        button3=findViewById(R.id.buttonImage4);
        button5=findViewById(R.id.buttonImage6);
        button6=findViewById(R.id.buttonImage7);
        button7=findViewById(R.id.buttonImage8);
        button8=findViewById(R.id.buttonImage9);
        button9=findViewById(R.id.buttonImage1);

        scorex = findViewById(R.id.ScoreX);
        scoreo = findViewById(R.id.ScoreY);

        Reset=findViewById(R.id.Reset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetvalues();
                xCount=0;
                oCount=0;
                scorex.setText("Score X :- "+String.valueOf(xCount));
                scoreo.setText("Score X :- "+String.valueOf(oCount));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                     button1.setImageResource(R.drawable.cross);
                     b1=1;
                     i++;
                }
                else
                {
                 button1.setImageResource(R.drawable.circle);
                 b1=0;
                 i++;
                }
                choosePlayer();
                winningGame();
                }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button2.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button3.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button3.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button4.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button4.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button5.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button5.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button6.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button6.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button7.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button7.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button8.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button8.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X"))
                {
                    button9.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else
                {
                    button9.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

    }

    private void winningGame()
    {
        
    }

    private void choosePlayer ()
    {
        if(startGame.equals("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }



    private void resetvalues() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;


    }
}