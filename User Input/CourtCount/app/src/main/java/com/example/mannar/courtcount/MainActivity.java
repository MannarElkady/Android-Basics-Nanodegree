package com.example.mannar.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void incThreeA(View View){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void incTwoA(View View){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void incOneA(View View){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(score));
    }
    public void incThreeB(View View){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void incTwoB(View View){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void incOneB(View View){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void reset(View v){
        scoreB=0;
        scoreA=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}


