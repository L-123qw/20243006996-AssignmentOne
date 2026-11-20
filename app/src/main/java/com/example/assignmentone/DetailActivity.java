package com.example.assignmentone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity that shows the details of the topic the user selected on
 * the main screen (Facilities, Events, Clubs or Support).
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the Intent extra that carries the unique topic identifier. */
    public static final String EXTRA_TOPIC_INDEX = "com.example.assignmentone.TOPIC_INDEX";

    /** Key of the Intent extra that carries the topic name. */
    public static final String EXTRA_TOPIC_NAME = "com.example.assignmentone.TOPIC_NAME";

    /** Unique identifiers of the four topics, matching the arrays.xml entries. */
    public static final int TOPIC_FACILITIES = 0;
    public static final int TOPIC_EVENTS = 1;
    public static final int TOPIC_CLUBS = 2;
    public static final int TOPIC_SUPPORT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
