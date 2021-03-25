package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Auth extends AppCompatActivity {
    Button reg;
    Button in;
    EditText login;
    EditText password;

    String Glogin;
    String Gpassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        reg = findViewById(R.id.Button_reg);
        in = findViewById(R.id.Button_in);
        login = findViewById(R.id.Login);
        password = findViewById(R.id.Password);

        Glogin = String.valueOf(login.getText());
        Gpassword = String.valueOf(password.getText());

        Intent intent = new Intent(Auth.this, MainActivity.class);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Glogin",Glogin );
                intent.putExtra("Gpassword", Gpassword);
                startActivity(intent);
                Toast.makeText(Auth.this,
                        "Вы успешно зарегестрировались",
                        Toast.LENGTH_SHORT).show();
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Glogin",Glogin );
                intent.putExtra("Gpassword", Gpassword);
                startActivity(intent);
                Toast.makeText(Auth.this,
                        "Вы успешно авторизировались",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
