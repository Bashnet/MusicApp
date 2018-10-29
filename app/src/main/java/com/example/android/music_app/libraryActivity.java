package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class libraryActivity extends AppCompatActivity {

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
                startActivity(new Intent(libraryActivity.this, NowPlayingActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //This creates the up navigation icon in the action bar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Setting the Listeners on Textviews

        TextView artist = findViewById(R.id.artists);
        TextView albums = findViewById(R.id.albums);
        TextView songs = findViewById(R.id.songs);
        TextView genres = findViewById(R.id.genres);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist = new Intent(libraryActivity.this, artistsActivity.class);
                startActivity(artist);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albums = new Intent(libraryActivity.this, albumsActivity.class);
                startActivity(albums);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs = new Intent(libraryActivity.this, songsActivity.class);
                startActivity(songs);
            }
        });

        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genres = new Intent(libraryActivity.this, genresActivity.class);
                startActivity(genres);
            }
        });
    }
}
