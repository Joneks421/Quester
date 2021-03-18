package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Auth extends AppCompatActivity {
    Button reg;
    Button in;
    EditText login;
    EditText password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        reg = findViewById(R.id.Button_reg);
        in = findViewById(R.id.Button_in);
        login = findViewById(R.id.Login);
        password = findViewById(R.id.Password);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Auth.this, MainActivity.class);
                startActivity(intent);
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Auth.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
