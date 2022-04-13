package com.shiryaev.pavel.bsbo_08_19.dialog;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button date, time, progres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        date = findViewById(R.id.DatePickShow);
        time = findViewById(R.id.TimePickShow);
        progres = findViewById(R.id.ProgressShow);
        MyDialogFragment dialogFragment = new MyDialogFragment();
        MyTimePickDialog timePickDialog = new MyTimePickDialog();
        MyDateDialog dateDialog = new MyDateDialog();
        MyProgressDialog progressDialog = new MyProgressDialog();
        button.setOnClickListener(view -> dialogFragment.show(getSupportFragmentManager(), "mirea"));
        date.setOnClickListener(view -> {
            dateDialog.show(getSupportFragmentManager(), "datePick");
        });
        time.setOnClickListener(view -> {
            timePickDialog.show(getSupportFragmentManager(), "timePick");
        });
        progres.setOnClickListener(view -> {
            progressDialog.show(getSupportFragmentManager(), "progressPick");
        });
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}