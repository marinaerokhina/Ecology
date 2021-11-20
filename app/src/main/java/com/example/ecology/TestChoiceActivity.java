package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class TestChoiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testchoice);
    }

    public void onGoingBack(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        onDestroy();
    }

    public void test_1 (View view){
        Intent intent = new Intent(this, Test_1.class);
        startActivity(intent);
        onPause();
    }
}
