package com.shiryaev.pavel.bsbo_08_19.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.textView);
        if(!getIntent().getExtras().isEmpty()){
            textView.setText(getIntent().getExtras().getString("key"));
        }
    }
}