package com.example.vartikasharma.a120_army;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.vartikasharma.a120_army.data.model.Post;
import com.example.vartikasharma.a120_army.data.model.ResObj;
import com.example.vartikasharma.a120_army.data.remote.UserService;
import com.example.vartikasharma.a120_army.data.remote.ApiUtils;

import static android.content.ContentValues.TAG;


public class Signup extends AppCompatActivity {
    TextView login_back;
    EditText f_name;
    EditText l_name;
    EditText u_email;
    EditText u_password;
    EditText u_dob;
    EditText u_gender;
    EditText confirm_password;
    EditText u_name;
    TextView next;
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        userService = ApiUtils.getUserService();

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        login_back=(TextView)findViewById(R.id.login_back);

        login_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Signup.this,Login.class));
            }
        });

        u_name = (EditText) findViewById(R.id.u_name);
        u_password = (EditText) findViewById(R.id.u_password);
        next =(TextView)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = u_name.getText().toString();
                String password = u_password.getText().toString();
                //validate form



                if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
                    sendPost(username, password);
                }

            }
        });

    }


    public void sendPost(String username, String password) {
        userService.savePost(username, password).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if (response.isSuccessful()) {

                    Toast.makeText(Signup.this, "Success!", Toast.LENGTH_SHORT).show();

                    Log.i(TAG, "post submitted to API." + response.body().toString());

                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Toast.makeText(Signup.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

}
