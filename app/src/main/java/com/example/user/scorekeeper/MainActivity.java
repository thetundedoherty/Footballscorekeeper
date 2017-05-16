package com.example.user.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int noOfFouls = 0;
    int noOfPenalty = 0;
    int score2 = 0;
    int noOfFouls2 = 0;
    int noOfPenalty2 = 0;
    int noOfOffside = 0;
    int noOfOffside2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method is clicked when the goal button is clicked for fc ifeanyi ubah
     */

    public void goalIncrement(View view) {
        score = score + 1;
        displayScore(score);
    }

    /**
     * this method is called when the foul button is clicked for fc ifeanyi ubah
     */

    public void foulIncrement(View view) {
        noOfFouls = noOfFouls + 1;
        displayNoOfFouls(noOfFouls);
    }

    /*
     * this method is called when the penalty button is clicked for fc ifeanyi ubah
     */
    public void penaltyIncrement(View view) {
        noOfPenalty = noOfPenalty + 1;
        displayNoOfPenalty(noOfPenalty);
    }

    /**
     *  this method is called when the offside button is clicked for ifeanyi ubah
     *
     */

      public void offsideIncrementUbah (View view){
          noOfOffside = noOfOffside + 1;
          displayNoOfOffside(noOfOffside);
      }



    /**
     * this method is called when the goal button is clicked for mfm fc
     */

    public void goalIncrementMfm(View view) {
        score2 = score2 + 1;
        displayScore2(score2);
    }

    /**
     * this method is called when the foul button is clicked for mfm fc
     */

    public void foulIncrementMfm(View view) {
        noOfFouls2 = noOfFouls2 + 1;
        displayNoOfFouls2(noOfFouls2);
    }

    /**
     * this method is called when the penalty button is clicked for mfm fc
     */

    public void penaltyIncrementMfm(View view) {
        noOfPenalty2 = noOfPenalty2 + 1;
        displayNoOfPenalty2(noOfPenalty2);
    }

    /**
     * this method is called when the offside button is clicked for mfm fc
     */

    public void offsideIncrementMfm(View view){
        noOfOffside2 =noOfOffside2 + 1;
        displayNoOfOffside2(noOfOffside2);
    }

    /**
     * this method display the score value on the screen for fc ifeanyi ubah
     */
    public void displayScore(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText("" + number);
    }

    /**
     * this method display the number of foul for fc ifeanyi ubah
     */

    public void displayNoOfFouls(int number) {
        TextView foulTextView = (TextView) findViewById(
                R.id.no_of_fouls);
        foulTextView.setText("" + number);

    }

    /**
     * this method display the number of penalty kick for fc ifeanyi ubah
     */

    public void displayNoOfPenalty(int number) {
        TextView penaltyTextView = (TextView) findViewById(R.id.no_of_penalty);
        penaltyTextView.setText("" + number);

    }

    /*
     * this method display offside for fc ifeanyi ubah
     */

    public void displayNoOfOffside (int number){
        TextView offsideTextView = (TextView) findViewById(R.id.no_of_offside);
        offsideTextView.setText(""+number);
    }

    /*
     * this method display the score for mfm fc
     */

    public void displayScore2(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score2);
        scoreTextView.setText("" + number);

    }

    /*
     * this method display the number of fouls for mfm fc
     */

    public void displayNoOfFouls2(int number) {
        TextView foulTextView = (TextView) findViewById(R.id.no_of_fouls2);
        foulTextView.setText("" + number);

    }

    /*
     * this method display the number of penalty for mfm fc
     */

    public void displayNoOfPenalty2(int number) {
        TextView penaltyTextView = (TextView) findViewById(R.id.no_of_penalty2);
        penaltyTextView.setText("" + number);

    }

    /**
     * this method display the number of offside for mfm fc
     */

    public void displayNoOfOffside2(int number){
        TextView offsideTextView =(TextView) findViewById(R.id.no_of_offside2);
        offsideTextView.setText(""+number);
    }

    /*
     * this method reset the score, foul and penalty numbers to zero for both teams
     */

    public void resetToZero (View v) {
        score = 0;
        noOfFouls = 0;
        noOfPenalty2 = 0;
        score2 = 0;
        noOfFouls2 = 0;
        noOfPenalty = 0;
        noOfOffside = 0;
        noOfOffside2 = 0;
        displayScore(score);
        displayNoOfFouls(noOfFouls);
        displayNoOfPenalty(noOfPenalty);
        displayScore2(score2);
        displayNoOfFouls2(noOfFouls2);
        displayNoOfPenalty2(noOfPenalty2);
        displayNoOfOffside(noOfOffside);
        displayNoOfOffside2(noOfOffside2);
    }

}





