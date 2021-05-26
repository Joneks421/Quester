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

public class CreateQuest extends AppCompatActivity {
    EditText nameTest;
    EditText shortInfo;
    EditText fullInfo;
    EditText authorName;
    EditText questText;
    EditText Balli;

    Button addButton;

    static String SAuthorName;
    static String SnameTest;
    static String SshortInfo;
    static String SFullinfo;
    static String SQuestText;
    static Integer SBalli;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createquest);

        nameTest = findViewById(R.id.NameTest);
        questText = findViewById(R.id.QuestText);
        shortInfo = findViewById(R.id.OpisaniaTesta);
        fullInfo = findViewById(R.id.FullOpisania);
        Balli = findViewById(R.id.Balli);
        addButton = findViewById(R.id.add_Button);
        authorName = findViewById(R.id.AuthorName);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateQuest.this, Tasks.class);
                try {
                    SnameTest = String.valueOf(nameTest.getText());
                    SQuestText = String.valueOf(questText.getText());
                    SshortInfo = String.valueOf(shortInfo.getText());
                    SFullinfo = String.valueOf(fullInfo.getText());
                    SAuthorName = String.valueOf(authorName.getText());
                    SBalli = Integer.valueOf(String.valueOf(Balli.getText()));
                    startActivity(intent);
                }catch (NumberFormatException e){
                    Toast.makeText(CreateQuest.this, "Вы ввели неподходящие данные",
                            Toast.LENGTH_LONG);

                }
            }
        });




    }

}
