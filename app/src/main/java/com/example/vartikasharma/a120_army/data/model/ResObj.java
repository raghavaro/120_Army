package com.example.vartikasharma.a120_army.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResObj {
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;


    public String getTitle() {
        return username;
    }

    public void setTitle(String username) {
        this.username = username;
    }

    public String getBody() {
        return password;
    }

    public void setBody(String password) {
        this.password = password;
    }



}