package com.example.android.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class favouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
