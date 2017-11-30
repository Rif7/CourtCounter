package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    class TeamScoreCounter {
        private TextView scoreTextView;
        private int score;

        TeamScoreCounter(String scoreTextViewId) {
            int resId = getResources().getIdentifier(scoreTextViewId, "id", getPackageName());
            this.scoreTextView = (TextView) findViewById(resId);
            resetScore();
        }

        private void resetScore() {
            score = 0;
        }

        private void increaseScore(int addedScore) {
            score += addedScore;
        }

        private void displayPoints() {
            scoreTextView.setText("" + score);
        }

    }

    private TeamScoreCounter scoreTeamA;
    private TeamScoreCounter scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = new TeamScoreCounter("scoreTeamA");
        scoreTeamB = new TeamScoreCounter("scoreTeamB");
        scoreTeamA.displayPoints();
        scoreTeamB.displayPoints();
    }

    public void plusThreePointsTeamA(View view) {
        scoreTeamA.increaseScore(3);
        scoreTeamA.displayPoints();
    }

    public void plusTwoPointsTeamA(View view) {
        scoreTeamA.increaseScore(2);
        scoreTeamA.displayPoints();
    }

    public void plusOnePointTeamA(View view) {
        scoreTeamA.increaseScore(1);
        scoreTeamA.displayPoints();
    }

    public void plusThreePointsTeamB(View view) {
        scoreTeamB.increaseScore(3);
        scoreTeamB.displayPoints();
    }

    public void plusTwoPointsTeamB(View view) {
        scoreTeamB.increaseScore(2);
        scoreTeamB.displayPoints();
    }

    public void plusOnePointTeamB(View view) {
        scoreTeamB.increaseScore(1);
        scoreTeamB.displayPoints();
    }

}
