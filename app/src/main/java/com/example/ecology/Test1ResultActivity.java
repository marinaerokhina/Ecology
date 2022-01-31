package com.example.ecology;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Test1ResultActivity extends AppCompatActivity {
    TextView ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, answer;
    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1result);
        Bundle arguments = getIntent().getExtras();
        int ans[] = new int[10];
        ans =  arguments.getIntArray("res");
        ans1 = findViewById(R.id.smthng);
        ans2 = findViewById(R.id.smthn);
        ans3 = findViewById(R.id.smth);
        ans4 = findViewById(R.id.smt);
        ans5 = findViewById(R.id.sm);
        ans6 = findViewById(R.id.s);
        ans7 = findViewById(R.id.smthng2);
        ans8 = findViewById(R.id.smthn2);
        ans9 = findViewById(R.id.smth2);
        ans10 = findViewById(R.id.smt2);
        answer = findViewById(R.id.smthg_);
        int cnt = 0;
        for (int i = 0; i<10; i++){
            if (ans[i]==1){
                cnt++;
            }
        }
        answer.setText(""+cnt+"% из 100%");
        if (ans[0]==1){
            ans1.setText("Правильно");
            ans1.setTextColor(R.color.dark_green);
        }else{
            ans1.setText("Неправильно");
            ans1.setTextColor(R.color.red);
        }if (ans[1]==1){
            ans2.setText("Правильно");
            ans2.setTextColor(R.color.dark_green);
        }else{
            ans2.setText("Неправильно");
            ans2.setTextColor(R.color.red);
        }if (ans[2]==1){
            ans3.setText("Правильно");
            ans3.setTextColor(R.color.dark_green);
        }else{
            ans3.setText("Неправильно");
            ans3.setTextColor(R.color.red);
        }if (ans[3]==1){
            ans4.setText("Правильно");
            ans4.setTextColor(R.color.dark_green);
        }else{
            ans4.setText("Неправильно");
            ans4.setTextColor(R.color.red);
        }if (ans[4]==1){
            ans5.setText("Правильно");
            ans5.setTextColor(R.color.dark_green);
        }else{
            ans5.setText("Неправильно");
            ans5.setTextColor(R.color.red);
        }if (ans[5]==1){
            ans6.setText("Правильно");
            ans6.setTextColor(R.color.dark_green);
        }else{
            ans6.setText("Неправильно");
            ans6.setTextColor(R.color.red);
        }if (ans[6]==1){
            ans7.setText("Правильно");
            ans7.setTextColor(R.color.dark_green);
        }else{
            ans7.setText("Неправильно");
            ans7.setTextColor(R.color.red);
        }if (ans[7]==1){
            ans8.setText("Правильно");
            ans8.setTextColor(R.color.dark_green);
        }else{
            ans8.setText("Неправильно");
            ans8.setTextColor(R.color.red);
        }if (ans[8]==1){
            ans9.setText("Правильно");
            ans9.setTextColor(R.color.dark_green);
        }else{
            ans9.setText("Неправильно");
            ans9.setTextColor(R.color.red);
        }if (ans[9]==1){
            ans10.setText("Правильно");
            ans10.setTextColor(R.color.dark_green);
        }else{
            ans10.setText("Неправильно");
            ans10.setTextColor(R.color.red);
        }
    }
}
