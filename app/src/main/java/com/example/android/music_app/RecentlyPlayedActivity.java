package com.example.android.music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_list);

        ArrayList<song> Songs = new ArrayList<song>();
        Songs.add(new song("Baton road", "KANA-BOOM", R.drawable.kanaboombaton));
        Songs.add(new song("Kaze", "Yamazaru", R.drawable.yamazarukaze));
        Songs.add(new song("Kara no Kokoro", "Anly", R.drawable.karanokokoro));
        Songs.add(new song("Hoshi to Bokura to", "Lyn", R.drawable.persona5));
        Songs.add(new song("Niwaka Ame Nimo Makezu", "NICO Touches the Walls", R.drawable.niwakaame));
        Songs.add(new song("Our Moment", "Lotus juice & Yumi Kawamura", R.drawable.persona3));
        Songs.add(new song("A Deep Mentality(Lotus uice Remix)", "Lotus juice", R.drawable.persona3));
        Songs.add(new song("The Battle for Everone's Soul", "T.Komine", R.drawable.persona3));
        Songs.add(new song("Velvet Club", "Ryouta Kozuka, Shoji Meguro", R.drawable.persona3));
        Songs.add(new song("Mass destrucion", "Lotus juice & Yumi Kawamura", R.drawable.persona3));
        Songs.add(new song("Wiping All Out", "Ryouta Kozuka", R.drawable.persona3));
        Songs.add(new song("Daze", "Jin", R.drawable.daze));
        Songs.add(new song("V.I.P", "SID", R.drawable.vip));
        Songs.add(new song("Kaze no Uta", "FLOW", R.drawable.flow));

        songAdapter adapter = new songAdapter(this, Songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
