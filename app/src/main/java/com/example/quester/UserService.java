package com.example.quester;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {
    @GET("/Quester/get.php")
    Call<Answer> getUsers();

    @GET("/Quester/insertJson.php")
    Call<Answer> insertCreate(
            @Query("text") String text,
            @Query("shortInfo") String shortInfo,
            @Query("fullInfo") String fullInfo,
            @Query("authorName") String authorName,
            @Query("testName") String testName,
            @Query("pointForCorrect") String pointForCorrect
    );

    @GET("/Quester/insertCreate.php")
    Call<Answer> insertJson(
            @Query("text") String text
    );

    @GET("/Quester/insert.php")
    Call<Answer> insertUser(
            @Query("login") String login,
            @Query("password") String password
    );
    @GET("/Quester/check.php")
    Call<Answer> checkUser(
            @Query("login") String login,
            @Query("password") String password
    );
}

class Answer{
    boolean status;
    ArrayList<User> data;

    String getStringUsers(){
        String res = "";
        for(User user: data){
            res += user.toString() + "\n";
        }
        return res;
    }
}

class User{
    int id;
    String login, password;

    @NonNull
    @Override
    public String toString() {
        return id + " " + login + " " + password;
    }
}
