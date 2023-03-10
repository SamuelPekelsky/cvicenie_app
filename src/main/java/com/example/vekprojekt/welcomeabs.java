package com.example.vekprojekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class welcomeabs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeabs);

    }
    public void prechodnadruhycvik(View view ) {
        String obtiaznost = String.valueOf(view.getTag());

        Intent davac = new Intent(getApplicationContext(), situps.class);
        davac.putExtra("obtiaznost", obtiaznost);
        startActivity(davac);
    }
}