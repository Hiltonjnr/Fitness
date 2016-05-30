package com.example.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This activity is the start point of the FitUp app
 * When opened, the activity starts FitnessActivity.
 */
public class Fitness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

    }
    // Moves from FitnessActivity to AbwheelActivity.
    public void abWheel(View v){
        Intent intent = new Intent(Fitness.this,AbWheel.class);
        startActivity(intent);
    }
    // Moves from FitnessActivity to PullUpBarActivity.
    public void pullUpBar(View v){
        Intent intent = new Intent(Fitness.this,PullUpBar.class);
        startActivity(intent);
    }

    // Moves from FitnessActivity to RomanChairActivity.
    public void romanChair(View v){
        Intent intent = new Intent(Fitness.this,RomanChair.class);
        startActivity(intent);
    // Moves from FitnessActivity to StabilityBallActivity.
    }
    public void stabilityBall(View v){
        Intent intent = new Intent(Fitness.this,StabilityBall.class);
        startActivity(intent);
    }
    // Moves from FitnessActivity to SitUpBenchActivity.
    public void sitUpBench (View v)
    {
        Intent intent = new Intent(Fitness.this, SitUpBench.class);
        startActivity(intent);
    }


}
