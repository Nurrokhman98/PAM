package com.user.romanz.moviesapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    public TextView txtTitle, txtoverview, txtdate, txtvote;
    public ImageView tvImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtdate = (TextView) findViewById(R.id.txtDate);
        txtoverview = (TextView) findViewById(R.id.txtDescrip);
        txtvote = (TextView) findViewById(R.id.txtrating);

        txtTitle.setText(getIntent().getStringExtra("title"));
        txtdate.setText(getIntent().getStringExtra("date"));
        txtoverview.setText(getIntent().getStringExtra("overview"));
        txtvote.setText(getIntent().getStringExtra("vote"));

        tvImg = (ImageView) findViewById(R.id.bg);
        Picasso.with(this)
                .load("https://image.tmdb.org/t/p/w300_and_h450_bestv2" + getIntent().getStringExtra("bg"))
                .resize(200, 300)
                .into(tvImg);
    }
}
