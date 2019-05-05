package com.example.vartikasharma.a120_army;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vartikasharma.a120_army.data.model.Post;
import com.example.vartikasharma.a120_army.data.remote.APIService;
import com.example.vartikasharma.a120_army.data.remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class Login extends AppCompatActivity {
    EditText email, password;
    TextView loginbtn;
    TextView tvresponse;
    TextView forgotpassword;
    TextView signup_back;
    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.loginemail);
        password = (EditText) findViewById(R.id.loginpassword);
        loginbtn = (TextView) findViewById(R.id.loginbtn);
        tvresponse = (TextView) findViewById(R.id.tv_response);
        forgotpassword = (TextView) findViewById(R.id.forgpassword);
        signup_back = (TextView) findViewById(R.id.signup_back);

        signup_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Signup.class));
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, forgotpassword.class));
            }
        });

        mAPIService = ApiUtils.getAPIService();

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_email = email.getText().toString().trim();
                String user_password = password.getText().toString().trim();
                if (!TextUtils.isEmpty(user_email) && !TextUtils.isEmpty(user_password)) {
                    sendPost(user_email, user_password);
                }
            }
        });

    }

    public void sendPost(String user_email, String user_password) {
        mAPIService.savePost(user_email, user_password).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if (response.isSuccessful()) {

                    showResponse(response.body().toString());
                    Log.i(TAG, "post submitted to API." + response.body().toString());

                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }


    public void showResponse(String response) {
        if (tvresponse.getVisibility() == View.GONE) {
            tvresponse.setVisibility(View.VISIBLE);
        }
        tvresponse.setText(response);


    }

}
