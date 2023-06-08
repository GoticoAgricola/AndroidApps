package com.example.frasessonoplastastvbr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View View){
        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[] frases = {"Cavalo","Dança gatinho, dança","UUUiiiii","Tome",
        "Demais","Ele Gosta","Uepa","Rapaz","Ratinho","PARE"};

        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);

    }



}