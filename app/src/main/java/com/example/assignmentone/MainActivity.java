package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main entry point of the CampusLife application.
 *
 * The activity shows the campus banner together with four ImageButtons
 * (Facilities, Events, Clubs and Support). Each button has an onClick
 * handler that shows a Toast so the event can be verified.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the Facilities ImageButton is clicked.
     * Shows a Toast to confirm that the click event works.
     */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the Events ImageButton is clicked.
     * Shows a Toast to confirm that the click event works.
     */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the Clubs ImageButton is clicked.
     * Shows a Toast to confirm that the click event works.
     */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the Support ImageButton is clicked.
     * Shows a Toast to confirm that the click event works.
     */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
    }
}
