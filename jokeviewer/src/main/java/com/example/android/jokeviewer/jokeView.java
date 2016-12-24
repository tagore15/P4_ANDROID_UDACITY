package com.example.android.jokeviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class jokeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);

        String jokeString = getIntent().getStringExtra("joke");
        TextView jokeTextView = (TextView) findViewById(R.id.jokeText);
        jokeTextView.setText(jokeString);
    }
}
