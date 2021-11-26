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
    boolean[] an = new boolean[10];
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
        q[0]="Кто написал письмо Фуску Авдию?";
        a1[0]="Птолемей";
        a2[0]="Аристотель";
        a3[0]="Гораций";
        a4[0]="Цезарь";
        r_a[0]="Гораций";
        quest.setText(q[0]);
        ans1.setText(a1[0]);
        ans2.setText(a2[0]);
        ans3.setText(a3[0]);
        ans4.setText(a4[0]);
    }

    public void onTesting1(View view){
        if(r_a[cnt].contentEquals(ans1.getText())){
            an[cnt]=true;
        }
        else an[cnt]=false;
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /**/
        }
    }
    public void onTesting2(View view){
        if(r_a[cnt].contentEquals(ans2.getText())){
            an[cnt]=true;
        }
        else an[cnt]=false;
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /**/
        }
    }
    public void onTesting3(View view){
        if(r_a[cnt].contentEquals(ans3.getText())){
            an[cnt]=true;
        }
        else an[cnt]=false;
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /**/
        }
    }
    public void onTesting4(View view){
        if(r_a[cnt].contentEquals(ans4.getText())){
            an[cnt]=true;
        }
        else an[cnt]=false;
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /**/
        }
    }
}
