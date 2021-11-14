package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void theme_1 (View view) {
        Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();
    }
}
