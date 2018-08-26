package com.example.devsdk.udacitymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Create a list of playlists with a FOR loop
        ArrayList<String> playlistItems = new ArrayList<>();

        for(int i = 1; i < 26; ++i){
            playlistItems.add("Playlist No." + i);
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, playlistItems);

        ListView listView = (ListView) findViewById(R.id.playList);

        listView.setAdapter(itemsAdapter);

    }
}
