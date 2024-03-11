package com.example.assignment1_activitylifecycle;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.assignment1_activitylifecycle.ActivityA.threadCounter;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    @Override
    protected void onStart() {
        super.onStart();
        threadCounter += 5;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
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
    }

    public void closeActivityB(View view) {
        ActivityB.this.finish();
    }

}
