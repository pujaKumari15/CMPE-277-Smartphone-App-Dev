package com.example.assignment1_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    static int threadCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        TextView threadCounterView = (TextView) findViewById(R.id.threadCounterView);
        threadCounterView.setText("Thread Counter: " + String.format("%04d",threadCounter));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        threadCounter = 0;
    }

    public void startActivityB (View view) {
        threadCounter += 5;
        startActivity(new Intent(ActivityA.this, ActivityB.class));
    }

    public void startActivityC (View view) {
        threadCounter += 10;
        startActivity(new Intent(ActivityA.this, ActivityC.class));
    }

    public void onTriggerDialog (View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(R.layout.activity_dialog)
                .show();

        View dialogView = alertDialog.getWindow().getDecorView();
        Button closeButton = dialogView.findViewById(R.id.closeDialog);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }

    public void closeActivityA (View view) {
        ActivityA.this.finish();
    }


}