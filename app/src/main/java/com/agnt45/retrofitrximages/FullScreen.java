package com.agnt45.retrofitrximages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FullScreen extends AppCompatActivity {
    private Intent intent;
    private ImageView FullScreenFlag;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        intent = this.getIntent();
        url = intent.getStringExtra("FlagUrl");
        FullScreenFlag = findViewById(R.id.FullScreenFlag);
        Picasso.with(this).load(url).into(FullScreenFlag);
    }

}
