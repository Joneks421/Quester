package com.example.quester;

import android.os.AsyncTask;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class AsyncUserLoader extends AsyncTask<String, Integer, Answer> {

    @Override
    protected Answer doInBackground(String... strings) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(strings[0])
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserService userService = retrofit.create(UserService.class);
        Call<Answer> call = getCall(userService);
        try {
            Response<Answer> response = call.execute();
            System.out.println(response.body());
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Answer answer) {
        postExecute(answer);
    }
    public abstract void postExecute(Answer answer);
    public abstract Call<Answer> getCall(UserService userService);
}
