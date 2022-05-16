package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    EditText textViewText;
    SharedPreferences preferences;
    private Button buttonToMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("==>","2nd Act Created");

        textViewText = findViewById(R.id.textviewtext);

        preferences = getSharedPreferences("preferences", MODE_PRIVATE);

        buttonToMain = findViewById(R.id.buttontomain);
        buttonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name",textViewText.getText().toString());
                editor.apply();
                finish();
            }
        });
    }
}
