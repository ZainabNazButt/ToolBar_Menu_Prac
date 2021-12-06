package com.example.task3_emissionpoints;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
public class Exam extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    String[] hal = {"أ ہ", "ع ح", "غ خ"};
    String[] lah  = {"ق", "ک"};
    String[] tar  = {"ل", "ن", "ر"};
    String[] nit = {"ت د ط"};
    String[] lis  = {"ظ ذ ث","س ز ص"};
    String[] sha = {"ج ش ی","ض"};
    String[] ghu  = {"م ن", "ف", "ب","و","باَ بوُ بىِ"};
    TextView mcq;
    String [] a;
    int random,rnd;
    static int i=0;
    static int corr=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        mcq = findViewById(R.id.random);
        btn1=findViewById(R.id.Halqiyah);
        btn2=findViewById(R.id.Lahatiyah);
        btn3=findViewById(R.id.Tarfiyah);
        btn4=findViewById(R.id.Nit_eeyah);
        btn5=findViewById(R.id.Lisaveyah);
        btn6=findViewById(R.id.Ghunna);
        btn7=findViewById(R.id.Shajariyah);
        btn8=findViewById(R.id.submit);

        Random ran = new Random();
        random = ran.nextInt(6);
        if (random == 0) {
            a = hal;
        } else if (random == 1) {
            a = lah;
        } else if (random == 2) {
            a = tar;
        } else if (random == 3) {
            a = nit;
        } else if (random == 4) {
            a = lis;
        } else if (random == 5) {
            a = ghu;
        } else if (random == 6) {
            a = sha;
        }
        rnd = new Random().nextInt(a.length);
        mcq.setText(String.valueOf(a[rnd]));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(hal)) {
                    corr++;
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(lah)) {
                    corr++;
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(tar)) {
                    corr++;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(nit)) {

                    corr++;
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(lis)) {

                    corr++;
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(ghu)) {
                    corr++;
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.equals(sha)) {

                    corr++;
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i<5)
                {
                    Intent  intent = new Intent(Exam.this,Exam.class);
                    startActivity(intent);

                }
                else
                {
                    Intent  intent = new Intent(Exam.this,FinalResult.class);
                    intent.putExtra("marks",corr);
                    startActivity(intent);
                }

            }
        });


    }



}

