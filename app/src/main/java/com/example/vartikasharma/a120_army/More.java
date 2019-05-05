package com.example.vartikasharma.a120_army;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class More extends AppCompatActivity {
    TextView aboutarmy;
    TextView contributors;
    TextView developers;
    TextView shop;
    TextView aboutus;
    TextView myaccount;
    TextView logout;
    TextView tou;
    TextView privacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        aboutarmy=(TextView)findViewById(R.id.aboutarmy);
        aboutarmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,About.class));
            }
        });
        contributors=(TextView)findViewById(R.id.contributors);
        contributors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Contributors.class));
            }
        });
        developers=(TextView)findViewById(R.id.developers);
        developers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Developers.class));
            }
        });

        myaccount=(TextView)findViewById(R.id.myaccount);
        myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,Accntdetails.class));
            }
        });

        tou=(TextView)findViewById(R.id.tou);
        tou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,terms.class));
            }
        });

        privacy=(TextView)findViewById(R.id.privacy);
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(More.this,privacy.class));
            }
        });



    }
}
