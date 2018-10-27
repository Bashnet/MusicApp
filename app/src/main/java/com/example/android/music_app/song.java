package com.example.android.music_app;

public class song {
    // Name of the song
    private String mSongName;

    //Name of artist
    private String mSongArtist;

    //The image resource
    private int mImageResourceId;

    public song(String songName, String songArtist, int imageeResourceId) {
        mSongName = songName;
        mSongArtist = songArtist;
        mImageResourceId = imageeResourceId;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the album
     */
    public String getSongArtist() {
        return mSongArtist;
    }

    /**
     * Get the album icon
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
