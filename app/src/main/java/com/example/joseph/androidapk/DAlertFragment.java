package com.example.joseph.androidapk;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by joseph on 10.04.2017.
 */

public class DAlertFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Title
                .setTitle(R.string.dialog_subject)
                // Set Dialog Message
                .setMessage(R.string.dialog_message)

                // Positive button
                .setPositiveButton(R.string.dialog_fragment_ok, (dialog, which) -> {
                    // Do something else
                }).create();
    }
}
