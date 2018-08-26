package com.example.devsdk.udacitymusicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlayListAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link PlayList} objects.
 */
public class PlayListAdapter extends ArrayAdapter<PlayList>  {

    /**
     * Create a new {@link PlayListAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param playlistItems is the list of {@link PlayList}s to be displayed.
     */
    public PlayListAdapter(Context context, ArrayList<PlayList> playlistItems) {
        super(context, 0, playlistItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link PlayList} object located at this position in the list
        PlayList currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the currentWord object and set this text on
        // the Artist TextView.
        artistTextView.setText(currentWord.getArtist());

        // Find the TextView in the list_item.xml layout with the ID album_text_view.
        TextView albumTextView = listItemView.findViewById(R.id.album_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the album TextView.
        albumTextView.setText(currentWord.getAlbum());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
