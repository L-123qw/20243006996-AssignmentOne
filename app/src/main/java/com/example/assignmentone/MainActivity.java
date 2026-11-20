package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main entry point of the CampusLife application.
 *
 * The activity shows the campus banner together with four ImageButtons
 * (Facilities, Events, Clubs and Support). Each button shows a Toast
 * and then starts the DetailActivity through an explicit Intent. The
 * Intent carries a unique identifier (the index of the topic) plus the
 * topic name, which the DetailActivity uses to decide which content to
 * display.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the Facilities ImageButton is clicked.
     * Starts the DetailActivity for the Facilities topic.
     */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        openDetail(DetailActivity.TOPIC_FACILITIES, getString(R.string.label_facilities));
    }

    /**
     * Called when the Events ImageButton is clicked.
     * Starts the DetailActivity for the Events topic.
     */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        openDetail(DetailActivity.TOPIC_EVENTS, getString(R.string.label_events));
    }

    /**
     * Called when the Clubs ImageButton is clicked.
     * Starts the DetailActivity for the Clubs topic.
     */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        openDetail(DetailActivity.TOPIC_CLUBS, getString(R.string.label_clubs));
    }

    /**
     * Called when the Support ImageButton is clicked.
     * Starts the DetailActivity for the Support topic.
     */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        openDetail(DetailActivity.TOPIC_SUPPORT, getString(R.string.label_support));
    }

    /**
     * Creates an explicit Intent that starts the DetailActivity.
     *
     * @param topicIndex the unique identifier of the selected topic
     * @param topicName  the name of the selected topic
     */
    private void openDetail(int topicIndex, String topicName) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_TOPIC_INDEX, topicIndex);
        intent.putExtra(DetailActivity.EXTRA_TOPIC_NAME, topicName);
        startActivity(intent);
    }
}
