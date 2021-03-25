package com.example.quester;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateQuest extends AppCompatActivity {
    EditText nameTest;
    EditText shortInfo;
    EditText fullInfo;

    static String SnameTest;
    static String SshortInfo;
    static String SFullinfo;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nameTest = findViewById(R.id.NameTest);
        shortInfo = findViewById(R.id.OpisaniaTesta);
        fullInfo = findViewById(R.id.FullOpisania);

        SnameTest = String.valueOf(nameTest.getText());
        SshortInfo = String.valueOf(shortInfo.getText());
        SFullinfo = String.valueOf(fullInfo.getText());




    }

}
