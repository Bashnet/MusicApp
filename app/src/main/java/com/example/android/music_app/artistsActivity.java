package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class artistsActivity extends AppCompatActivity {

    //This method creates the action bar icon in the activity layout

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.now_playing, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //this enables the icon to link to the now playing screen

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.now_playing:
                startActivity(new Intent(artistsActivity.this, NowPlayingActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_grid);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


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
