package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation_display);

        final ArrayList<miwokDefaultTranslation> wordTrans= new ArrayList<miwokDefaultTranslation>();
        wordTrans.add(new miwokDefaultTranslation("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        wordTrans.add(new miwokDefaultTranslation("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        wordTrans.add(new miwokDefaultTranslation("oyaaset...","My name is...",R.raw.phrase_my_name_is));
        wordTrans.add(new miwokDefaultTranslation("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        wordTrans.add(new miwokDefaultTranslation("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        wordTrans.add(new miwokDefaultTranslation("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        wordTrans.add(new miwokDefaultTranslation("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        wordTrans.add(new miwokDefaultTranslation("әәnәm","I’m coming.",R.raw.phrase_im_coming));
        wordTrans.add(new miwokDefaultTranslation("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        wordTrans.add(new miwokDefaultTranslation("әnni'nem","Come here.",R.raw.phrase_come_here));
        miwokAdapter itemsAdapter = new miwokAdapter(this, wordTrans,R.color.blue);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miwokDefaultTranslation currentWord = wordTrans.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,currentWord.getSoundId());
                mMediaPlayer.start();
            }
        });
    }
}
