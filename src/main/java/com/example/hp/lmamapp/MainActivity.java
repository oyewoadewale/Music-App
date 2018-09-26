package com.example.hp.lmamapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the my_playlistml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the nowplaying category
        TextView numbers = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nowplaying category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link nowplayingActivity}
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowplayingIntent);
            }
        });

        // Find the View that shows the playlist category
        TextView family = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link playlistActivity}
                Intent playlistIntent = new Intent(MainActivity.this,PlayListActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the Album category
        TextView colors = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the favourite category
        TextView phrases = (TextView) findViewById(R.id.favourite);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayListActivity}
                Intent favouriteIntent = new Intent(MainActivity.this, PlayListActivity.class);

                // Start the new activity
                startActivity(favouriteIntent);
            }
        });
    }

}
