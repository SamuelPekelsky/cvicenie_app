package com.example.vekprojekt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

import java.util.ArrayList;

public class calendar2 extends AppCompatActivity {

    CalendarView calendarView;
    ArrayList<String> dates=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);
        calendarView = findViewById(R.id.calendarView);

        SharedPreferences mSharedPreference1 = PreferenceManager.getDefaultSharedPreferences(this);
        dates.clear();
        int size = mSharedPreference1.getInt("Status_size", 0);

        for (int i = 0; i < size; i++) {
            dates.add(mSharedPreference1.getString("Status_" + i, null));
        }


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                String curDate = String.valueOf(dayOfMonth);
                dates.add(curDate);
                Intent davac = new Intent(getApplicationContext(), LEGS.class);
                startActivity(davac);
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(calendar2.this);
                SharedPreferences.Editor mEdit1 = sp.edit();
                /* sKey is an array */
                mEdit1.putInt("Status_size", dates.size());

                for (int i = 0; i < dates.size(); i++) {
                    mEdit1.remove("Status_" + i);
                    mEdit1.putString("Status_" + i, dates.get(i));
                }

                mEdit1.commit();
            }
        });
    }
}