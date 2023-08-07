package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation_display);

        final ArrayList<miwokDefaultTranslation> wordTrans= new ArrayList<miwokDefaultTranslation>();
        wordTrans.add(new miwokDefaultTranslation("әpә","father",R.drawable.family_father));
        wordTrans.add(new miwokDefaultTranslation("әṭa","mother",R.drawable.family_mother));
        wordTrans.add(new miwokDefaultTranslation("angsi","son",R.drawable.family_son));
        wordTrans.add(new miwokDefaultTranslation("tune","daughter",R.drawable.family_daughter));
        wordTrans.add(new miwokDefaultTranslation("taachi","older brother",R.drawable.family_older_brother));
        wordTrans.add(new miwokDefaultTranslation("chalitti","younger brother",R.drawable.family_younger_brother));
        wordTrans.add(new miwokDefaultTranslation("teṭe","older sister",R.drawable.family_older_sister));
        wordTrans.add(new miwokDefaultTranslation("kolliti","younger sister",R.drawable.family_younger_sister));
        wordTrans.add(new miwokDefaultTranslation("ama","grandmother",R.drawable.family_grandmother));
        wordTrans.add(new miwokDefaultTranslation("paapa","grandfather",R.drawable.family_grandfather));
        miwokAdapter itemsAdapter = new miwokAdapter(this, wordTrans,R.color.green);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miwokDefaultTranslation currentWord = wordTrans.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this,currentWord.getSoundId());
                mMediaPlayer.start();
            }
        });
    }
}
