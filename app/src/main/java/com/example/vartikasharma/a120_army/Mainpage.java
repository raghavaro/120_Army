package com.example.vartikasharma.a120_army;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Mainpage extends AppCompatActivity {

    private TextView mTextMessage;
    LinearLayout marriage;
    LinearLayout parent;
    LinearLayout myprayer;
    final Context context = this;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_prayerboard:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dailyprayer:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_events:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.navigation_donate:
                    startActivity(new Intent(Mainpage.this,donate.class));
                    return true;
                case R.id.navigation_more:
                    startActivity(new Intent(Mainpage.this,More.class));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        marriage=(LinearLayout) findViewById(R.id.marriage);
        parent=(LinearLayout)findViewById(R.id.parent);
        myprayer=(LinearLayout)findViewById(R.id.myprayer);

        marriage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.daymarriage);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button

                TextView dialogButton = (TextView) dialog.findViewById(R.id.ivretry);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.parenting);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button

                TextView dialogButton = (TextView) dialog.findViewById(R.id.ivstart);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        myprayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.postprayer);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button

                TextView dialogButton = (TextView) dialog.findViewById(R.id.post);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });



    }

}
