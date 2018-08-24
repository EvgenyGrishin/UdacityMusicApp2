package com.example.devsdk.udacitymusicapp;

public class Word {

    private String mArtist;

    private String mAlbum;

    public Word(String Artist, String Album) {
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
