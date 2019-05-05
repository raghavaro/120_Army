package com.example.vartikasharma.a120_army.data.remote;

import com.example.vartikasharma.a120_army.data.model.Post;
import com.example.vartikasharma.a120_army.data.model.ResObj;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("/signup")
    Call<Post> savePost(@Field("username") String username,
                        @Field("password") String password);


}