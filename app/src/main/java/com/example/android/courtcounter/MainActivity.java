package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
        displayPoints(score);
    }

    private void displayPoints(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score);
        quantityTextView.setText("" + number);
    }

    private void increaseDisplayedScore(int addedPoints) {
        score += addedPoints;
        displayPoints(score);
    }

    public void plusThreePoints(View view) {
        increaseDisplayedScore(3);
    }

    public void plusTwoPoints(View view) {
        increaseDisplayedScore(2);
    }

    public void plusOnePoint(View view){
        increaseDisplayedScore(1);
    }

}
