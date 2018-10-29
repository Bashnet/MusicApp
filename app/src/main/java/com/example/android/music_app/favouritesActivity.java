package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class favouritesActivity extends AppCompatActivity {

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
                startActivity(new Intent(favouritesActivity.this, NowPlayingActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.main_list);

        ArrayList<song> Songs = new ArrayList<song>();
        Songs.add(new song("Kaze no Uta", "FLOW", R.drawable.flow));
        Songs.add(new song("Brave Shine", "Aimer", R.drawable.aimer));
        Songs.add(new song("HARUKAZE", "SCANDAL", R.drawable.harukaze));
        Songs.add(new song("Last Suprise(Taku Takahasi Remix)", "Taku Takahasi", R.drawable.persona5));
        Songs.add(new song("Whims of Fate(Yukihiro Fuktomi Remix)", "Yukihiro Fuktomi", R.drawable.persona5));
        Songs.add(new song("Kaze no Uta", "FLOW", R.drawable.flow));

        songAdapter adapter = new songAdapter(this, Songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
