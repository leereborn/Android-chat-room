package com.carleton.chattime;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class welcomeActivity extends AppCompatActivity {

    private static int TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(welcomeActivity.this, MainActivity.class);
                welcomeActivity.this.startActivity(mainIntent);
                welcomeActivity.this.finish();
            }
        }, 3000);
    }
}
