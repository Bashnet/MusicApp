package com.example.android.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class playlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid);

        ArrayList<gridViewItems> grids = new ArrayList<gridViewItems>();
        grids.add(new gridViewItems("rum mix", R.drawable.kanaboombaton));
        grids.add(new gridViewItems("Drop the Beats", R.drawable.edm1));

        gridViewAdapter adapter = new gridViewAdapter(this, grids);

        GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
