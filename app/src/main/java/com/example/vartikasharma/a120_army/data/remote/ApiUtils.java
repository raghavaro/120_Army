package com.example.vartikasharma.a120_army.data.remote;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://army120.appspot.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}