package com.example.dminh.litecirleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    final String TAG1 = "Activity 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d(TAG1,"STATUS: onCreate()");
    }

    public void gotoActivity1(View view){
        //go to activiey 2
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG1,"STATUS: onStart()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG1,"STATUS: onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG1,"STATUS: onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG1,"STATUS: onDestroy()");
    }
}
