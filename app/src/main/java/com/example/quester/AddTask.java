package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddTask extends AppCompatActivity {
    EditText questionText;
    EditText questionAmount;
    EditText timeAmount;

    static String SQuestionText;
    static String SQuestionsAmount;
    static String STimeAmount;


    Button addOptionAnswer;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        questionText = findViewById(R.id.questionText);
        questionAmount = findViewById(R.id.questionAmount);
        addOptionAnswer = findViewById(R.id.button_addOptionAnswer);

        SQuestionText = String.valueOf(questionText.getText());
        SQuestionsAmount = String.valueOf(questionAmount.getText());
        STimeAmount = String.valueOf(timeAmount.getText());

        addOptionAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, AnswerOptions.class);
                startActivity(intent);
            }
        });

    }
}
