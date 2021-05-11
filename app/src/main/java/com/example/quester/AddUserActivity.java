package com.example.quester;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;

public class AddUserActivity extends AppCompatActivity {

    EditText loginEditText, passwordEditText, nameEditText;
    Button addUserButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        loginEditText = findViewById(R.id.Login);
        passwordEditText = findViewById(R.id.Password);

        addUserButton = findViewById(R.id.Button_reg);

        addUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = String.valueOf(loginEditText);
                String password = String.valueOf(passwordEditText);
                String name = String.valueOf(nameEditText);
                AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
                    @Override
                    public void postExecute(Answer answer) {
                        loginEditText.setText("");
                        passwordEditText.setText("");
                        nameEditText.setText("");
                    }

                    @Override
                    public Call<Answer> getCall(UserService userService) {
                        return userService.insertUser(login, password);
                    }
                };
                asyncUserLoader.execute("https://10.148.190.161/nikita/");
            }
        });
    }
}

