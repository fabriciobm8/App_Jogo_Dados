package com.example.jg_dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton = findViewById(R.id.rollButton);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","Entrou no Clique do Botao!");
                ImageView leftDice = findViewById(R.id.leftDice);
                ImageView rightDice = findViewById(R.id.rightDice);
                final int[] diceeArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                                        R.drawable.dice4, R.drawable.dice5, R.drawable.dice6 };
                Random numberRandom = new Random();
                int number1 = numberRandom.nextInt(6);
                leftDice.setImageResource(diceeArray[number1]);
                int number2 = numberRandom.nextInt(6);
                rightDice.setImageResource(diceeArray[number2]);
                int resultado = (number1+1) +(number2+1);
                Log.d("Dice","Dado da Esquerda: "+(number1+1));
                Log.d("Dice","Dado da Direita: "+(number2+1));
                Toast.makeText(MainActivity.this,"Resultado: "+resultado,Toast.LENGTH_SHORT).show();
            }
        });
    }
}