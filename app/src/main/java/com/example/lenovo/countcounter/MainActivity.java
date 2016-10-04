package com.example.lenovo.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreA = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void Plus3(View v){
        int point3 = 3;
        ScoreA= ScoreA + point3;
        PrintScoreA(ScoreA);
    }
    public void Plus2(View v){
        int point2 = 2;
        ScoreA=ScoreA + point2;
        PrintScoreA(ScoreA);
    }
    public void PlusFree(View v){
        int pointFree = 1;
        ScoreA = ScoreA + pointFree;
        PrintScoreA(ScoreA);
    }


    private  void PrintScoreA(int sA){
        TextView t = (TextView) findViewById(R.id.score_a);
        t.setText("" + sA);
    }





}
