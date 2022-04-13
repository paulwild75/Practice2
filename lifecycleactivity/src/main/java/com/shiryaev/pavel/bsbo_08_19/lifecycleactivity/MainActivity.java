package com.shiryaev.pavel.bsbo_08_19.lifecycleactivity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "ONSTART");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "ONEPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "ONDESTROy");
    }
}