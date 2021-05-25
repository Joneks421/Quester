package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AnswerOptions extends AppCompatActivity {

    EditText optionText;

    String SOptionText;
    static Integer count = 1;

    CheckBox rightAnswer;

    Button nextOption;
    ArrayList<String> va = new ArrayList<String>();
    ArrayList<Integer> rightAnswers = new ArrayList<Integer>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answeroptions);
        optionText = findViewById(R.id.OptionText);
        rightAnswer = findViewById(R.id.rightOption);
        nextOption = findViewById(R.id.nextOption);



        nextOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SOptionText = String.valueOf(optionText.getText());
                if (count < AddTask.SQuestionsAmount){
                    if(rightAnswer.isChecked()){
                        rightAnswers.add(count);
                    }

                    va.add(SOptionText);
                    optionText.setText("");
                    count+= 1;
                }else {
                    va.add(SOptionText);
                    if(rightAnswer.isChecked()){
                        rightAnswers.add(count);
                    }
                    Json.variest.add((ArrayList<String>) va.clone());
                    Json.answer.add(((ArrayList<Integer>) rightAnswers.clone()));
                    count = 1;
                    System.out.println(Json.variest);
                    va.clear();
                    Intent intent = new Intent(AnswerOptions.this, Json.class);
                    Intent intent1 = new Intent(AnswerOptions.this, Tasks.class);
                    startActivity(intent1);


                }



            }
        });
    }
}
