package com.example.languageapp;

import android.media.Image;

import androidx.annotation.Nullable;

public class miwokDefaultTranslation {
    private final int NoImage = 0, NoSound = 0;
    private String miwokWord;
    private String defaultWord;
    private int imageId = NoImage;
    private int soundId = NoSound;
    public miwokDefaultTranslation(String miwokWord, String defaultWord, Integer soundId)
    {
        this.defaultWord=defaultWord;
        this.miwokWord=miwokWord;
        this.soundId=soundId;
    }

    public miwokDefaultTranslation(String miwokWord, String defaultWord ,Integer imageid, Integer soundId)
    {
        this.defaultWord=defaultWord;
        this.miwokWord=miwokWord;
        this.imageId=imageid;
        this.soundId=soundId;
    }

    public int getImageId()
    {
        return imageId;
    }
    public String getMiwokWord()
    {
        return miwokWord;
    }
    public String getDefaultWord()
    {
        return defaultWord;
    }
    public int getSoundId(){ return soundId;}
}
