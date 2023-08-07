package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers=(TextView) findViewById(R.id.numbers_button);
        numbers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigate(v,NumbersActivity.class);
            }
        });
        TextView family=(TextView) findViewById(R.id.family_button);
        family.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigate(v,FamilyMembersActivity.class);
            }
        });
        TextView colours=(TextView) findViewById(R.id.colours_button);
        colours.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigate(v,ColoursActivity.class);
            }
        });
        TextView phrases=(TextView) findViewById(R.id.phrases_button);
        phrases.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Navigate(v,PhrasesActivity.class);
            }
        });
    }

    public void Navigate(View view, Class c)
    {
        Intent runIntent = new Intent(this,c);
        startActivity(runIntent);
    }
}
