package com.example.task3_emissionpoints;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.stream.IntStream;

import java.util.Random;
public class Practise extends AppCompatActivity  implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    String[] Halqiyah = {"أ ہ", "ع ح", "غ خ"};
    String[] Lahatiyah  = {"ق", "ک"};
    String[] Tarfiyah  = {"ل", "ن", "ر"};
    String[] Nit_eeyah = {"ت د ط"};
    String[] Lisaveyah  = {"ظ ذ ث","س ز ص"};
    String[] Shajariya = {"ج ش ی","ض"};
    String[] Ghunna  = {"م ن", "ف", "ب","و","باَ بوُ بىِ"};
    TextView view,answer;
    String [] a={};
    int random,rnd;String option="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise);
        view=findViewById(R.id.random);
        answer=findViewById(R.id.ans);


        btn1=findViewById(R.id.Halqiyah);
        btn2=findViewById(R.id.Lahatiyah);
        btn3=findViewById(R.id.Tarfiyah);
        btn4=findViewById(R.id.Nit_eeyah);
        btn5=findViewById(R.id.Lisaveyah);
        btn6=findViewById(R.id.Ghunna);
        btn7=findViewById(R.id.Shajariyah);
        btn8=findViewById(R.id.word);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Halqiyah:
                if(Arrays.stream(Halqiyah).anyMatch(t -> t.equals(a[rnd])))
                {
                 answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Lahatiyah:
                if(Arrays.stream(Lahatiyah).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Tarfiyah:
                if(Arrays.stream(Tarfiyah).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Nit_eeyah:
                if(Arrays.stream(Nit_eeyah).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Lisaveyah:
                if(Arrays.stream(Lisaveyah).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Ghunna:
                if(Arrays.stream(Ghunna).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.Shajariyah:
                if(Arrays.stream(Shajariya).anyMatch(t -> t.equals(a[rnd])))
                {
                    answer.setText(String.valueOf("Correct"));
                }
                else
                {
                    answer.setText(String.valueOf("Wrong"));
                }
                break;
            case R.id.word:
                answer.setText(String.valueOf("Answer"));
                final int min = 0;
                final int max = 6;
                random = new Random().nextInt((max - min) + 1) + min;
                a=selectArray(random);
                rnd = new Random().nextInt(a.length);
                view.setText(String.valueOf(a[rnd]));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
    public String [] selectArray(int no)
    {
        switch (no){
            case 0:
                return Halqiyah;
            case 1:
                return Lahatiyah;
            case 2:
                return Tarfiyah;
            case 3:
                return Nit_eeyah;
            case 4:
                return Lisaveyah;
            case 5:
                return Shajariya;
            case 6:
                return Ghunna;
            default:
                throw new IllegalStateException("Unexpected value ");

        }
    }

}