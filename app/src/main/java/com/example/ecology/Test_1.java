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
        q[1]="Что послужило толчком для развития природопользования в эпоху возрождения?";
        a1[1]="Великие географические открытия";
        a2[1]="Технологическая революция";
        a3[1]="Раскол христианской церкви";
        a4[1]="Падение Константинополя";
        r_a[1]="Великие географические открытия";
        q[2]="Шведский естествоиспытатель, живший в 1707-1778 годах, это...";
        a1[2]="Л. Да Винчи";
        a2[2]="И. Ньютон";
        a3[2]="М. Ломоносов";
        a4[2]="К. Линней";
        r_a[2]="К. Линней";
        q[3]="Одна из работ Карла Линнея называлась...";
        a1[3]="Экология природы";
        a2[3]="Экономия природы";
        a3[3]="Устройство природы";
        a4[3]="Общее устройство природы";
        r_a[3]="Экономия природы";
        q[5]="Что такое 'экономия' в понимании Линнея?";
        a1[5]="систему биоценозов";
        a2[5]="экосистиемы и их этапы развития";
        a3[5]="взаимоотношения всех естественных тел";
        a4[5]="общее устройство природы вокруг";
        r_a[5]="взаимоотношения всех естественных тел";
        quest.setText(q[0]);
        ans1.setText(a1[0]);
        ans2.setText(a2[0]);
        ans3.setText(a3[0]);
        ans4.setText(a4[0]);
    }

    public void onTesting1(View view){
        an[cnt]= r_a[cnt].contentEquals(ans1.getText());
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /*Intent intent = new Intent(this, Test_1_res.class);
            start_activity(intent);
            onPause()*/
        }
    }
    public void onTesting2(View view){
        an[cnt]= r_a[cnt].contentEquals(ans2.getText());
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /*Intent intent = new Intent(this, Test_1_res.class);
            start_activity(intent);
            onPause()*/
        }
    }
    public void onTesting3(View view){
        an[cnt]= r_a[cnt].contentEquals(ans3.getText());
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /*Intent intent = new Intent(this, Test_1_res.class);
            start_activity(intent);
            onPause()*/
        }
    }
    public void onTesting4(View view){
        an[cnt]= r_a[cnt].contentEquals(ans4.getText());
        cnt++;
        if(cnt<10){
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else {
            /*Intent intent = new Intent(this, Test_1_res.class);
            start_activity(intent);
            onPause()*/
        }
    }
}
