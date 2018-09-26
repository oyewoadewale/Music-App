package com.example.hp.lmamapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlayListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Find the View that shows the nowplaying category
        GridView nowplaying = (GridView) findViewById(R.id.list);
        setContentView(nowplaying);

        TextView title;
        nowplaying.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                Toast.makeText(PlayListActivity.this, "" + position, Toast.LENGTH_SHORT).show();

                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(PlayListActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Create a list of words
        ArrayList<Album> words = new ArrayList<Album>();
        words.add(new Album("Sinach", "I know who i am"));
        words.add(new Album("Eli j", "Lets pray"));
        words.add(new Album("Frank Edward", "overtake"));
        words.add(new Album("Ur Flames", "i dont want this to end"));
        words.add(new Album("Unknown", "Bullet proof"));
        words.add(new Album("Sinach", "I'm Blessed"));
        words.add(new Album("Joe praise", "kenekaku"));
        words.add(new Album("CSO", "Holy Spirit"));
        words.add(new Album("Pastor saki", "I worship you"));
        words.add(new Album("Israel strong", "This year"));
        words.add(new Album("A4jeasy", "The Word is working"));
        words.add(new Album("TB1", "Na so"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // word_list.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a two word.
        AlbumAdapter adapter =
                new AlbumAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // myplaylist.xml layout file.
        GridView listView = (GridView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }

}
