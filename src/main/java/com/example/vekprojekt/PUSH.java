package com.example.vekprojekt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class PUSH extends YouTubeBaseActivity {

    TextView countdown,repsandseries;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_push);
        repsandseries=(TextView)findViewById(R.id.repsandseries);
        repsandseries.append("REPS 8-12"+"\n"+"\n");
        repsandseries.append("SERIES 4");
    }




    public void spustiodpocet (View view) {
        countdown = (TextView) findViewById(R.id.countdown);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                countdown.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                countdown.setText("done!");
            }
        }.start();

    }
    public void prechodnadruhycvik(View view ) {
        Intent davac = new Intent(getApplicationContext(), Inclinebench.class);
        startActivity(davac);
    }

}

