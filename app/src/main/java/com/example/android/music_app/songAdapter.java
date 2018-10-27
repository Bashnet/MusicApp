package com.example.android.music_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class songAdapter extends ArrayAdapter<song> {

    private static final String LOG_TAG = songAdapter.class.getSimpleName();

    /**
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public songAdapter(Activity context, ArrayList<song> androidFlavors) {

        super(context, 0, androidFlavors);
    }

    /**
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songName = listItemView.findViewById(R.id.song_name);
        // Get the song name from the current song object and
        // set this text on the name TextView
        songName.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID song_artist
        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        // Get the song artist from the current song object and
        // set this text on the number TextView
        songArtist.setText(currentSong.getSongArtist());

        // Find the ImageView in the list_item.xml layout with the ID album_icon
        ImageView albumIcon = listItemView.findViewById(R.id.album_icon);
        // Get the image resource ID from the current song object and
        // set the image to iconView
        albumIcon.setImageResource(currentSong.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

