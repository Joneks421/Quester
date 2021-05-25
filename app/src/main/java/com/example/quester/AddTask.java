package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AddTask extends AppCompatActivity {
    EditText questionText;
    EditText questionAmount;
    EditText timeAmount;
    ArrayList<String> textThis = new ArrayList<String>();
    ArrayList<Integer> timeThis = new ArrayList<Integer>();

    static String SQuestionText;
    static Integer SQuestionsAmount;
    static Integer STimeAmount;


    Button addOptionAnswer;


    public static String getSQuestionText() {
        return SQuestionText;
    }

    public void setSQuestionText(String SQuestionText) {
        this.SQuestionText = SQuestionText;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        questionText = findViewById(R.id.questionText);
        questionAmount = findViewById(R.id.questionAmount);
        addOptionAnswer = findViewById(R.id.button_addOptionAnswer);
        timeAmount = findViewById(R.id.TimeAmount);



        addOptionAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, AnswerOptions.class);
                Intent intent2 = new Intent(AddTask.this, AnswerOptions.class);

                SQuestionText = String.valueOf(questionText.getText());
                SQuestionsAmount = Integer.valueOf(String.valueOf(questionAmount.getText()));
                STimeAmount = Integer.valueOf(String.valueOf(timeAmount.getText()));
                textThis.add(SQuestionText);
                timeThis.add(STimeAmount);
                Json.texts.add((ArrayList<String>) textThis.clone());
                Json.times.add((ArrayList<Integer>) timeThis.clone());
                textThis.clear();
                startActivity(intent2);

            }
        });


    }
}
