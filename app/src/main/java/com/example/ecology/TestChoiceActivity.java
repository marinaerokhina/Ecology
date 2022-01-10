package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
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

    public void test_2 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_3 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_4 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_5 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_6 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_7 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_8 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_9 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
    public void test_10 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, R.string.unavailable_func, Toast.LENGTH_LONG).show();
    }
}
