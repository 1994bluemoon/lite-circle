package com.example.dminh.litecirleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final String TAG2 = "Activity 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG2,"STATUS: onCreate()");
    }

    public void gotoActivity2(View view){
        //go to activiey 2
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG2,"STATUS: onStart()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG2,"STATUS: onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG2,"STATUS: onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG2,"STATUS: onDestroy()");
    }
}
