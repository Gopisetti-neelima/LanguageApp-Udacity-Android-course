package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation_display);

        final ArrayList<miwokDefaultTranslation> wordTrans= new ArrayList<miwokDefaultTranslation>();
        wordTrans.add(new miwokDefaultTranslation("lutti","One",R.drawable.number_one,R.raw.number_one));
        wordTrans.add(new miwokDefaultTranslation("ottiko","Two",R.drawable.number_two,R.raw.number_two));
        wordTrans.add(new miwokDefaultTranslation("tolookosu","Three",R.drawable.number_three,R.raw.number_three));
        wordTrans.add(new miwokDefaultTranslation("oyyisa","Four",R.drawable.number_four,R.raw.number_four));
        wordTrans.add(new miwokDefaultTranslation("massokka","Five",R.drawable.number_five,R.raw.number_five));
        wordTrans.add(new miwokDefaultTranslation("temmokka","Six",R.drawable.number_six,R.raw.number_six));
        wordTrans.add(new miwokDefaultTranslation("kenekaku","Seven",R.drawable.number_seven,R.raw.number_seven));
        wordTrans.add(new miwokDefaultTranslation("kewinta","Eight",R.drawable.number_eight,R.raw.number_eight));
        wordTrans.add(new miwokDefaultTranslation("wo'e","Nine",R.drawable.number_nine,R.raw.number_nine));
        wordTrans.add(new miwokDefaultTranslation("na'accha","ten",R.drawable.number_ten,R.raw.number_ten));
        miwokAdapter itemsAdapter = new miwokAdapter(this, wordTrans,R.color.orange);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miwokDefaultTranslation currentWord = wordTrans.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,currentWord.getSoundId());
                mMediaPlayer.start();
            }
        });
    }
}
