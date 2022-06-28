package com.example.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RatingBar rB;
    public SeekBar sB;
    public DatePicker dP;
    public TimePicker tP;
    public Button Bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rB = findViewById(R.id.ratingBar);
        sB = findViewById(R.id.seekBar);
        dP = findViewById(R.id.DP);
        tP = findViewById(R.id.TP);
        Bt = findViewById(R.id.BUT);

        rB.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){
                Toast.makeText(MainActivity.this, "You have rated: "+rating, Toast.LENGTH_LONG).show();
            }
        });

        sB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}