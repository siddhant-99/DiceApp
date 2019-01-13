package com.example.devil.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView dice1 = findViewById(R.id.image_leftDice);
        final ImageView dice2 = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","Button was pressed");
                Random randomNumber = new Random();
                int diceRoll = randomNumber.nextInt(6);
                dice1.setImageResource(diceArray[diceRoll]);
                diceRoll = randomNumber.nextInt(6);
                dice2.setImageResource(diceArray[diceRoll]);

            }
        });
    }
}
