package com.example.vekprojekt;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dumbellvup extends AppCompatActivity {

    TextView countdown;
    String obtiaznost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbellvup);

        Intent intent = getIntent();
        obtiaznost = intent.getStringExtra("obtiaznost");
    }


    public void spustiodpocet (View view) {
        int cas = 30000;
        if (obtiaznost.equals("intermediate")) {
            cas = 40000;
        }
        else if (obtiaznost.equals("advanced")) {
            cas = 60000;
        }
        countdown = (TextView) findViewById(R.id.countdown);
        new CountDownTimer(cas, 1000) {

            public void onTick(long millisUntilFinished) {
                countdown.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                countdown.setText("done!");
            }
        }.start();

    }
    public void prechodnadruhycvik(View view ) {
        Intent davac = new Intent(getApplicationContext(), russiantwists.class);
        davac.putExtra("obtiaznost", obtiaznost);
        startActivity(davac);
    }
}