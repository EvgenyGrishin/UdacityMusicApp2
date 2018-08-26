package com.example.devsdk.udacitymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        setContentView(R.layout.word_list);

        // Create a list of albums
        ArrayList<PlayList> playlistItems = new ArrayList<>();
        playlistItems.add(new PlayList("Vivaldi","Les Quatre Saisons"));
        playlistItems.add(new PlayList("Vivaldi", "Concerto In A Minor and Concerto In D Minor"));
        playlistItems.add(new PlayList("Vivaldi", "No. 11 / Divertimento In D Major (K. 251)"));
        playlistItems.add(new PlayList("Vivaldi", "No. 4 In G"));
        playlistItems.add(new PlayList("Vivaldi", "Oratorio"));
        playlistItems.add(new PlayList("Vivaldi", "Sonates Et Concerti"));
        playlistItems.add(new PlayList("Vivaldi", "No. 6 For Strings"));
        playlistItems.add(new PlayList("Metallica", "Ride the lighting"));

        // Create an {@link PlayListAdapter}, whose data source is a list of {@link PlayList}s. The
        // adapter knows how to create list items for each item in the list.
        PlayListAdapter adapter = new PlayListAdapter(this, playlistItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlayListAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link PlayList} in the list.
        listView.setAdapter(adapter);
    }
}
