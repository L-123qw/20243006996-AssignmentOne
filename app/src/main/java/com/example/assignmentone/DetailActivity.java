package com.example.assignmentone;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity that shows the details of the topic the user selected on
 * the main screen (Facilities, Events, Clubs or Support).
 *
 * The activity receives the unique identifier of the clicked topic
 * through the Intent that started it, and uses that identifier to
 * retrieve the matching title, content and image from the dummy data
 * stored in arrays.xml.
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

        // Retrieve the unique identifier and the topic name from the Intent.
        Intent intent = getIntent();
        int topicIndex = intent.getIntExtra(EXTRA_TOPIC_INDEX, TOPIC_FACILITIES);
        String topicName = intent.getStringExtra(EXTRA_TOPIC_NAME);

        // Load the dummy data arrays from arrays.xml. Each entry i of the
        // arrays belongs to the ImageButton with the identifier i, so the
        // data can be looked up directly by index without any if statements
        // or switch cases.
        Resources resources = getResources();
        String[] images = resources.getStringArray(R.array.string_array_images);
        String[] titles = resources.getStringArray(R.array.string_array_titles);
        String[] contents = resources.getStringArray(R.array.string_array_content);

        // Resolve the image name (e.g. "img_btn_facilities") that belongs to
        // the clicked topic to its drawable resource id.
        String imageName = images[topicIndex].trim();
        int imageResId = resources.getIdentifier(imageName, "drawable", getPackageName());

        // Get the views of the layout.
        ImageView topicImage = findViewById(R.id.detail_topic_image);
        TextView topicNameView = findViewById(R.id.detail_topic_name);
        TextView titleView = findViewById(R.id.detail_title);
        TextView contentView = findViewById(R.id.detail_content);

        // Populate the UI with the title, content and image that belong to
        // the ImageButton that was clicked.
        topicImage.setImageResource(imageResId);
        topicNameView.setText(topicName);
        titleView.setText(titles[topicIndex]);
        contentView.setText(contents[topicIndex]);
    }
}
