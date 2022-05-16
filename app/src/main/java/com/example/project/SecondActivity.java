package com.example.project;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    public SecondActivity(){
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>","MA2 Resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>","MA2 Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>","MA2 Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>","MA2 Destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("==>","2nd Act Created");
    }
}
