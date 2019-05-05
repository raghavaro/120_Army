package com.example.vartikasharma.a120_army.data.remote;

import com.example.vartikasharma.a120_army.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/login")
    @FormUrlEncoded
    Call<Post> savePost(@Field("user_email") String user_email,
                        @Field("user_password") String user_password);



}
