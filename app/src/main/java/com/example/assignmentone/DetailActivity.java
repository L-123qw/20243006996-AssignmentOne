package com.example.assignmentone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity that shows the details of the topic the user selected on
 * the main screen (Facilities, Events, Clubs or Support).
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
