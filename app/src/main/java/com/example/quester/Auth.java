package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;

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
                AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
                    @Override
                    public void postExecute(Answer answer) {
                        if (answer.status) {
                            login.setText("");
                            password.setText("");
                            startActivity(intent);
                            Toast.makeText(Auth.this,
                                    "Вы успешно зарегистрировались",
                                    Toast.LENGTH_SHORT).show();
                        }else {
                            login.setText("");
                            password.setText("");
                            Toast.makeText(Auth.this,
                                    "Введенные недопустимые данные или логин уже занят",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }


                    @Override
                    public Call<Answer> getCall(UserService userService) {
                        return userService.insertUser(Glogin, Gpassword);
                    }
                };
                asyncUserLoader.execute("https://localhost/Quester/");
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
                    @Override
                    public void postExecute(Answer answer) {
                        if (answer.status) {
                            login.setText("");
                            password.setText("");
                            startActivity(intent);
                            Toast.makeText(Auth.this,
                                    "Вы успешно авторизировались",
                                    Toast.LENGTH_SHORT).show();

                        }else{
                            login.setText("");
                            password.setText("");
                            Toast.makeText(Auth.this,
                                    "Вы ввели неправильные данные",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public Call<Answer> getCall(UserService userService) {
                        return userService.checkUser(Glogin, Gpassword);
                    }
                };
                asyncUserLoader.execute("https://localhost/Quester/");
            }
        });

    }
}
