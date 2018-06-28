package com.example.android.delhihistory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class settings extends AppCompatActivity {
    private MediaPlayer mplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mplayer = MediaPlayer.create(this,R.raw.backgroundsong_sun_after_rain);
        Button btn = (Button) findViewById(R.id.aboutussettings);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abtset = new Intent(settings.this,aboutus.class);
                startActivity(abtset);
            }
        });
    }

}
