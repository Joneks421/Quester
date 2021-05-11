package com.example.quester;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateQuest extends AppCompatActivity {
    EditText nameTest;
    EditText shortInfo;
    EditText fullInfo;
    EditText authorName;
    EditText questText;

    static String SAuthorName;
    static String SnameTest;
    static String SshortInfo;
    static String SFullinfo;
    static String SQuestText;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nameTest = findViewById(R.id.NameTest);
        questText = findViewById(R.id.QuestText);
        shortInfo = findViewById(R.id.OpisaniaTesta);
        fullInfo = findViewById(R.id.FullOpisania);
        authorName = findViewById(R.id.AuthorName);

        SnameTest = String.valueOf(nameTest.getText());
        SQuestText = String.valueOf(questText.getText());
        SshortInfo = String.valueOf(shortInfo.getText());
        SFullinfo = String.valueOf(fullInfo.getText());
        SAuthorName = String.valueOf(authorName.getText());




    }

}
