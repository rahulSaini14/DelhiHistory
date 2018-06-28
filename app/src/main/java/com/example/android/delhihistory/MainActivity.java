package com.example.android.delhihistory;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mplayer = MediaPlayer.create(this, R.raw.backgroundsong_sun_after_rain);
        mplayer.start();
        mplayer.setLooping(true);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertonback = new AlertDialog.Builder(MainActivity.this);
        alertonback.setMessage("Are you sure, you want to exit?").setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertonback.create();
        alert.show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mplayer.release();
    }

    public void fun2(View view) {
        Intent a = new Intent(this, Main2Activity.class);
        startActivity(a);
    }

}