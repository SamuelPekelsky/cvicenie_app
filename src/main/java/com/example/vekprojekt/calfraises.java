package com.example.vekprojekt;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calfraises extends AppCompatActivity {

    TextView countdown,repsandseries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calfraises);
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
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);
    }
}