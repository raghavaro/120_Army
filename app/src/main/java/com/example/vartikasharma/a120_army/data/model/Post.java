package com.example.vartikasharma.a120_army.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("user_email")
    @Expose
    private String user_email;
    @SerializedName("user_password")
    @Expose
    private String user_password;


    public String getTitle() {
        return user_email;
    }

    public void setTitle(String user_email) {
        this.user_email = user_email;
    }

    public String getBody() {
        return user_password;
    }

    public void setBody(String user_password) {
        this.user_password = user_password;
    }


    @Override
    public String toString() {
        return "Post{" +
                "Email='" + user_email + '\'' +
                ", Password='" + user_password + '\'' +
                '}';
    }
}
