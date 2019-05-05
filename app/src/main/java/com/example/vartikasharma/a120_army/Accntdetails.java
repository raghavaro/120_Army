package com.example.vartikasharma.a120_army;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Accntdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accntdetails);

        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
    }
}
