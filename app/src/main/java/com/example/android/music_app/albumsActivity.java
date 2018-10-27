package com.example.android.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class albumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid);

        ArrayList<gridViewItems> grids = new ArrayList<gridViewItems>();
        grids.add(new gridViewItems("daze/days", R.drawable.daze));
        grids.add(new gridViewItems("Diver", R.drawable.niwakaame));
        grids.add(new gridViewItems("KANA-BOOM", R.drawable.kanaboombaton));
        grids.add(new gridViewItems("KELUN", R.drawable.chubura));
        grids.add(new gridViewItems("P5D", R.drawable.persona5));
        grids.add(new gridViewItems("This is War", R.drawable.war));

        gridViewAdapter adapter = new gridViewAdapter(this, grids);

        GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
