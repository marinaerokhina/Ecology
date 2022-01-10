package com.example.ecology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

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
    int cnt=0, count=0;
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
        q[4]="Что такое 'экономия' в понимании Линнея?";
        a1[4]="систему биоценозов";
        a2[4]="экосистиемы и их этапы развития";
        a3[4]="взаимоотношения всех естественных тел";
        a4[4]="общее устройство природы вокруг";
        r_a[4]="взаимоотношения всех естественных тел";
        q[5]="Французский исследователь природы Ж. Бюффон в XXXX г. предпринял дерзкую для того времени попытку представить развитие Земли, животного мира и человека как единый эволюционный ряд. Какой год здесь имеется ввиду?";
        a1[5]="1748";
        a2[5]="1759";
        a3[5]="1789";
        a4[5]="1749";
        r_a[5]="1749";
        q[6]="Кто написал письмо Фуску Авдию?";
        a1[6]="Птолемей";
        a2[6]="Аристотель";
        a3[6]="Гораций";
        a4[6]="Цезарь";
        r_a[6]="Гораций";
        q[7]="Что послужило толчком для развития природопользования в эпоху возрождения?";
        a1[7]="Великие географические открытия";
        a2[7]="Технологическая революция";
        a3[7]="Раскол христианской церкви";
        a4[7]="Падение Константинополя";
        r_a[7]="Великие географические открытия";
        q[8]="Шведский естествоиспытатель, живший в 1707-1778 годах, это...";
        a1[8]="Л. Да Винчи";
        a2[8]="И. Ньютон";
        a3[8]="М. Ломоносов";
        a4[8]="К. Линней";
        r_a[8]="К. Линней";
        q[9]="Одна из работ Карла Линнея называлась...";
        a1[9]="Экология природы";
        a2[9]="Экономия природы";
        a3[9]="Устройство природы";
        a4[9]="Общее устройство природы";
        r_a[9]="Экономия природы";
        quest.setText(q[0]);
        ans1.setText(a1[0]);
        ans2.setText(a2[0]);
        ans3.setText(a3[0]);
        ans4.setText(a4[0]);
    }

    public void onTesting1(View view){
        if(cnt<10){
            an[cnt]= r_a[cnt].contentEquals(ans1.getText());
            if (an[cnt]){
                count++;
            }
            cnt++;
            quest.setText(q[cnt]);
            ans1.setText(a1[cnt]);
            ans2.setText(a2[cnt]);
            ans3.setText(a3[cnt]);
            ans4.setText(a4[cnt]);
        }
        else if (cnt<11){
            an[cnt]= r_a[cnt].contentEquals(ans1.getText());
            if (an[cnt]){
                count++;
            }
            cnt++;
            quest.setText("Вы закончили выполнение теста");
            ans1.setText("Посмотреть результат");
            ans2.setText("Перейти в раздел тестов");
            ans3.setText("Перейти в раздел тем");
            ans4.setText("Перейти к теме теста");
        }
        else  {
            ResultFragment dialog = new ResultFragment();
            dialog.setCount(count);
            dialog.show(getSupportFragmentManager(), "custom");
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
        else if (cnt<11){
            an[cnt]= r_a[cnt].contentEquals(ans2.getText());
            if (an[cnt]){
                count++;
            }
            cnt++;
            quest.setText("Вы закончили выполнение теста");
            ans1.setText("Посмотреть результат");
            ans2.setText("Перейти в раздел тестов");
            ans3.setText("Перейти в раздел тем");
            ans4.setText("Перейти к теме теста");
        }
        else {
            Intent intent = new Intent(this, TestChoiceActivity.class);
            startActivity(intent);
            onPause();
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
        else if (cnt<11){
            an[cnt]= r_a[cnt].contentEquals(ans3.getText());
            if (an[cnt]){
                count++;
            }
            cnt++;
            quest.setText("Вы закончили выполнение теста");
            ans1.setText("Посмотреть результат");
            ans2.setText("Перейти в раздел тестов");
            ans3.setText("Перейти в раздел тем");
            ans4.setText("Перейти к теме теста");
        }
        else {
            Intent intent = new Intent(this, ChoiceActivity.class);
            startActivity(intent);
            onPause();
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
        else if (cnt<11){
            an[cnt]= r_a[cnt].contentEquals(ans4.getText());
            if (an[cnt]){
                count++;
            }
            cnt++;
            quest.setText("Вы закончили выполнение теста");
            ans1.setText("Посмотреть результат");
            ans2.setText("Перейти в раздел тестов");
            ans3.setText("Перейти в раздел тем");
            ans4.setText("Перейти к теме теста");
        }
        else {
            Intent intent = new Intent(this, Theme_1.class);
            startActivity(intent);
            onPause();
        }
    }
}
