package com.example.quester;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {
    @GET("get.php")
    Call<Answer> getUsers();

    @GET("insert.php")
    Call<Answer> insertUser(
            @Query("login") String login,
            @Query("password") String password,
            @Query("name") String name
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
    String login, password, name;

    @NonNull
    @Override
    public String toString() {
        return id + " " + login + " " + password + " " + name;
    }
}
