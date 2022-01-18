package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
Button back, start, test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onStarting(View view) {
        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivity(intent);
        onPause();
    }

    public void onStartingTest(View view) {
        Intent intent = new Intent(this, TestChoiceActivity.class);
        startActivity(intent);
        onPause();
    }
}
