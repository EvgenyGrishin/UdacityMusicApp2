package com.example.devsdk.udacitymusicapp;

public class PlayList {

    private String mArtist;

    private String mAlbum;

    public PlayList(String Artist, String Album) {
        mArtist = Artist;
        mAlbum = Album;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

}
