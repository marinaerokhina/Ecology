package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
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
    public void theme_2 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_3 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_4 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_5 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_6 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_7 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_8 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_9 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
    public void theme_10 (View view) {
        /*Intent intent = new Intent(this, Theme_1.class);
        startActivity(intent);
        onPause();*/
        Toast.makeText(this, "@string/unavailable_func", Toast.LENGTH_LONG).show();
    }
}
