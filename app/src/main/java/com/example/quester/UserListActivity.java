package com.example.quester;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;

public class UserListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
            @Override
            public void postExecute(Answer answer) {
                if (answer != null) {
                }
                else {
                }
            }

            @Override
            public Call<Answer> getCall(UserService userService) {
                return userService.getUsers();
            }
        };

        asyncUserLoader.execute("https://10.148.190.161/nikita/");
    }

}

