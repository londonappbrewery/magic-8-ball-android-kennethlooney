package com.londonappbrewery.magiceightball;

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

        Button shakeButton;
        shakeButton = (Button)findViewById(R.id.shakebutton);
        final ImageView ball = (ImageView)findViewById(R.id.ballImage);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8Ball","The ball has been shaken");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                ball.setImageResource(ballArray[number]);
            }
        });


    }
}
