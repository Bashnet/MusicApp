package com.example.android.music_app;

// This class is used to display the plaliyst and album activities in grid format.

public class gridViewItems {
    private String mName;
    private int mImageResource;

    public gridViewItems(String Name, int ImageResource) {
        mName = Name;
        mImageResource = ImageResource;
    }

    public String getName() {
        return mName;
    }

    public int getImageResource() {
        return mImageResource;
    }
}
