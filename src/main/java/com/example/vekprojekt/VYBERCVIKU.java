package com.example.vekprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VYBERCVIKU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vybercviku);
    }
    public void push (View view){
        Intent davac = new Intent(getApplicationContext(), calendar.class);
        startActivity(davac);

    }
    public void pull (View view){
        Intent davac = new Intent(getApplicationContext(), calendar1.class);
        startActivity(davac);

    }
    public void legs (View view){
        Intent davac = new Intent(getApplicationContext(), calendar2.class);
        startActivity(davac);

    }
    public void abs (View view){
        Intent davac = new Intent(getApplicationContext(), calendar3.class);
        startActivity(davac);

    }

}