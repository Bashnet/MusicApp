package com.example.android.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class artistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid);

        ArrayList<gridViewItems> grids = new ArrayList<gridViewItems>();
        grids.add(new gridViewItems("30 Seconds to Mars", R.drawable.war));
        grids.add(new gridViewItems("BEAT CRUSADERS", R.drawable.beat));
        grids.add(new gridViewItems("KANA-BOOM", R.drawable.kanaboombaton));
        grids.add(new gridViewItems("KELUN", R.drawable.chubura));
        grids.add(new gridViewItems("Lotus juice", R.drawable.persona5));
        grids.add(new gridViewItems("Lyn", R.drawable.persona5));

        gridViewAdapter adapter = new gridViewAdapter(this, grids);

        GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
