package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation_display);

        final ArrayList<miwokDefaultTranslation> wordTrans= new ArrayList<miwokDefaultTranslation>();
        wordTrans.add(new miwokDefaultTranslation("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        wordTrans.add(new miwokDefaultTranslation("chokokki","green",R.drawable.color_green,R.raw.color_green));
        wordTrans.add(new miwokDefaultTranslation("takakki","brown",R.drawable.color_brown,R.raw.color_brown));
        wordTrans.add(new miwokDefaultTranslation("topoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        wordTrans.add(new miwokDefaultTranslation("kululli","black",R.drawable.color_black,R.raw.color_black));
        wordTrans.add(new miwokDefaultTranslation("kelelli","white",R.drawable.color_white,R.raw.color_white));
        wordTrans.add(new miwokDefaultTranslation("topiise","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        wordTrans.add(new miwokDefaultTranslation("chiviite","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        miwokAdapter itemsAdapter = new miwokAdapter(this, wordTrans,R.color.violet);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miwokDefaultTranslation currentWord = wordTrans.get(position);
                mMediaPlayer = MediaPlayer.create(ColoursActivity.this,currentWord.getSoundId());
                mMediaPlayer.start();
            }
        });
    }
}
