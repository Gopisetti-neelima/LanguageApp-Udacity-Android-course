package com.example.languageapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class miwokAdapter extends ArrayAdapter <miwokDefaultTranslation>{
    private int color;
    public miwokAdapter(@NonNull Context context, ArrayList<miwokDefaultTranslation> word, int color) {
        super(context, 0,word);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        miwokDefaultTranslation currentWord= getItem(position);
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.data_single_tab,parent,false);
        }
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.getImageId()==0)
        {
            imageView.setVisibility(View.INVISIBLE);
        }
        else
            imageView.setImageResource(currentWord.getImageId());
        TextView miwokword = listItemView.findViewById(R.id.miwok_word);
        miwokword.setText(currentWord.getMiwokWord());
        TextView defaultword = listItemView.findViewById(R.id.default_word);
        defaultword.setText(currentWord.getDefaultWord());
        View text_tab = listItemView.findViewById(R.id.text_tab);
        text_tab.setBackgroundResource(color);
        return listItemView;
    }
}