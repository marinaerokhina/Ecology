package com.example.ecology;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Test_1 extends AppCompatActivity {
    Button ans1, ans2, ans3, ans4;
    TextView quest;
    String[] q = new String[10];
    String[] a1 = new String[10];
    String[] a2 = new String[10];
    String[] a3 = new String[10];
    String[] a4 = new String[10];
    String[] r_a = new String[10];
    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        ans1=findViewById(R.id.btn_ans1);
        ans2=findViewById(R.id.btn_ans2);
        ans3=findViewById(R.id.btn_ans3);
        ans4=findViewById(R.id.btn_ans4);
        quest=findViewById(R.id.question);

    }

    public void onTesting(View view){

    }
}
