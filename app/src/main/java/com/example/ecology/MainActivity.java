package com.example.ecology;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button enter, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.btn_enter);
    }
    public void onEntering (View view){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        /*onPause();*/
    }
}