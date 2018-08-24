package com.example.devsdk.udacitymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    CardView playerCardView;
    CardView playlistsCardView;
    CardView albumsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playlistsCardView = findViewById(R.id.menuPlaylists);
        albumsCardView = findViewById(R.id.menuAlbums);

        playlistsCardView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);


    }

    final View.OnClickListener playlistsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlaylistsList(playlistsCardView);
        }
    };

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openAlbumsList(albumsCardView);
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, AlbumsActivity.class);
        startActivity(intent);
    }

    public void openPlaylistsList(View view) {
        Intent intent = new Intent(this, PlaylistsActivity.class);
        startActivity(intent);
    }

}
