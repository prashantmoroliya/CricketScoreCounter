package com.example.android.cricketscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //If team A lost all 10 wickets
    boolean teamAAllOut = false;

    //If team B lost all 10 wicket
    boolean teamBAllOut = false;

    //Track the scores of Team A
    int scoreTeamA = 0;

    //Track the wickets of Team A
    int wicketA = 0;

    //Track the scores of Team B
    int scoreTeamB = 0;

    //Track the wickets of Team B
    int wicketB = 0;

    String message = "All Out";
    String resetMessage = "Decision";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by extra run i.e. 1.
     */
    public void addExtraForTeamA(View v) {
        if(!teamAAllOut)
            scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by a run i.e. 1.
     */
    public void addRunForTeamA(View v) {
        if(!teamAAllOut)
            scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by four run.
     */
    public void addFourForTeamA(View v) {
        if(!teamAAllOut)
            scoreTeamA = scoreTeamA + 4;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by six run.
     */
    public void addSixForTeamA(View v) {
        if(!teamAAllOut)
            scoreTeamA = scoreTeamA + 6;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Wicket for team A
     */
    public void wicketTeamA(View v) {
        if(wicketA < 9) {
            wicketA++;
            displayWicketForTeamA(wicketA);
        } else {
            teamAAllOut = true;
            displayAllOutMessage(message);
        }
    }

    /**
     * Increase the score for Team B by extra run i.e. 1.
     */
    public void addExtraForTeamB(View v) {
        if(!teamBAllOut)
            scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by a run i.e. 1.
     */
    public void addRunForTeamB(View v) {
        if(!teamBAllOut)
            scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by four run.
     */
    public void addFourForTeamB(View v) {
        if(!teamBAllOut)
            scoreTeamB = scoreTeamB + 4;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by six run.
     */
    public void addSixForTeamB(View v) {
        if(!teamBAllOut)
            scoreTeamB = scoreTeamB + 6;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Wicket for team B
     */
    public void wicketTeamB(View v) {
        if(wicketB < 9) {
            wicketB++;
            displayWicketForTeamB(wicketB);
        } else {
            teamBAllOut = true;
            displayAllOutMessage(message);
        }
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void reset(View v) {
        teamAAllOut = false;
        teamBAllOut = false;
        scoreTeamA = 0;
        wicketA = 0;
        scoreTeamB = 0;
        wicketB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayWicketForTeamA(wicketA);
        displayScoreForTeamB(scoreTeamB);
        displayWicketForTeamB(wicketB);
        displayAllOutMessage(resetMessage);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.score_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the wickets for Team A.
     */
    public void displayWicketForTeamA(int score) {
        TextView scoreView = findViewById(R.id.wicket_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.score_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the wickets for Team B.
     */
    public void displayWicketForTeamB(int score) {
        TextView scoreView = findViewById(R.id.wicket_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays All out message.
     */
    public void displayAllOutMessage(String message) {
        TextView messageAllOut = findViewById(R.id.decision);
        messageAllOut.setText(String.valueOf(message));
    }
}
