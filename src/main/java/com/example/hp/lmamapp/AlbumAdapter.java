package com.example.hp.lmamapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * Create a new {@link AlbumAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Album}s to be displayed.
     */
    public AlbumAdapter(Context context, ArrayList<Album> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.my_playlist, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.songtext_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        albumTextView.setText(currentAlbum.getAlbumname());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        artistTextView.setText(currentAlbum.getArtistname());


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}