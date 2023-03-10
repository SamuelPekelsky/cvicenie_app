package com.example.vekprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Druha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druha);

    }

    public void mon(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);
    }

    public void tue(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);
    }

    public void wed(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);

    }

    public void thu(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);

    }

    public void fri(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);

    }

    public void sat(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);

    }

    public void sun(View view) {
        Intent davac = new Intent(getApplicationContext(), VYBERCVIKU.class);
        startActivity(davac);

    }
}