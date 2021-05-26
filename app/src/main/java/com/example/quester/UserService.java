package com.example.quester;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {
    @GET("/Quester/get.php")
    Call<Answer> getTest();

    @GET("/Quester/insertJson.php")
    Call<Answer> insertCreate(
            @Query("text") String text,
            @Query("shortInfo") String shortInfo,
            @Query("fullInfo") String fullInfo,
            @Query("authorName") String authorName,
            @Query("testName") String testName,
            @Query("pointForCorrect") Integer pointForCorrect
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
    ArrayList<TasksClass> data;

    String getStringTests(){
        String res = "";
        for(TasksClass test: data){
            res += test.toString() + "\n";
        }
        return res;
    }
}

class Test{
    int id, pointForCorrect;
    String text, shortInfo, fullInfo, authorName, testName;

    @NonNull
    @Override
    public String toString() {
        return id + " " + pointForCorrect + " " + text + " " + shortInfo + " " + fullInfo + " " +  authorName + " " + testName;
    }
}
