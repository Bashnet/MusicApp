package com.example.android.music_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class gridViewAdapter extends ArrayAdapter<gridViewItems> {

    /**
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public gridViewAdapter(Activity context, ArrayList<gridViewItems> androidFlavors) {

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
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        gridViewItems currentItem = getItem(position);

        // Find the TextView in the grid_item.xml layout
        TextView itemName = gridItemView.findViewById(R.id.name_id);
        // Get the name and
        // set this text on the name TextView
        itemName.setText(currentItem.getName());

        // Find the ImageView in the grid_item.xml layout
        ImageView albumIcon = gridItemView.findViewById(R.id.album_icon);
        // Get the image resource ID from the and
        // set the image to iconView
        albumIcon.setImageResource(currentItem.getImageResource());

        // Return the whole list item layout (containing a TextView and an ImageView)
        // so that it can be shown in the ListView
        return gridItemView;
    }

}

