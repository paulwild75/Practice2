package com.shiryaev.pavel.bsbo_08_19.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

class MyTimePickDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstance) {
        java.util.Calendar dateAndTime = java.util.Calendar.getInstance();
        TimePickerDialog.OnTimeSetListener timeSetListener = (view, hour, minute) -> {
            dateAndTime.set(Calendar.HOUR, hour);
            dateAndTime.set(Calendar.MINUTE, minute);
        };
        return new TimePickerDialog(getContext(), timeSetListener,
                dateAndTime.get(Calendar.HOUR),
                dateAndTime.get(Calendar.MINUTE),
                true);
    }
}
