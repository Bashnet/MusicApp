package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
                startActivity(new Intent(MainActivity.this, NowPlayingActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView recentlyPlayed = findViewById(R.id.recently_played);
        final TextView favourites = findViewById(R.id.favourites);
        TextView playlist = findViewById(R.id.playlist);
        TextView library = findViewById(R.id.library);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(MainActivity.this, libraryActivity.class);
                startActivity(library);
            }
        });

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentlyPlayed = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                startActivity(recentlyPlayed);
            }
        });

        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent faourites = new Intent(MainActivity.this, favouritesActivity.class);
                startActivity(faourites);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(MainActivity.this, playlistActivity.class);
                startActivity(playlist);
            }
        });
    }
}
