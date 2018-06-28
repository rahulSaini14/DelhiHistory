package com.example.android.delhihistory;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Gallery extends AppCompatActivity {
    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void nextimage(View view) {
        ImageView ib = (ImageView) findViewById(R.id.nxtimg);
        if (x == 1) {
            ib.setImageResource(R.drawable.g_aksherdham);
        }
        if (x == 2) {
            ib.setImageResource(R.drawable.g_chhaterpur);
        }
        if (x == 3) {
            ib.setImageResource(R.drawable.g_college);
        }
        if (x == 4) {
            ib.setImageResource(R.drawable.g_delhiroad);
        }
        if (x == 5) {
            ib.setImageResource(R.drawable.g_hanumanmurti);
        }
        if (x == 6) {
            ib.setImageResource(R.drawable.g_humaiyustomb);
        }
        if (x == 7) {
            ib.setImageResource(R.drawable.g_independentsday);
        }
        if (x == 8) {
            ib.setImageResource(R.drawable.g_jantermanter);
        }
        if (x == 9) {
            ib.setImageResource(R.drawable.g_lotustemple);
        }
        if (x == 10) {
            ib.setImageResource(R.drawable.g_metroblue);
        }
        if (x == 11) {
            ib.setImageResource(R.drawable.g_puranakila);
        }
        if (x == 12) {
            ib.setImageResource(R.drawable.g_metrostation);
        }
        if (x == 13) {
            ib.setImageResource(R.drawable.g_qutubminar);
        }
        if (x == 14) {
            ib.setImageResource(R.drawable.g_rashtrapatibhavan);
        }
        if (x == 15) {
            ib.setImageResource(R.drawable.g_trafic);
        }
        if (x == 16) {
            ib.setImageResource(R.drawable.g_indiagate2);
        }
        if (x == 17) {
            ib.setImageResource(R.drawable.g_indiagate);
            x = 0;
        }
        x++;
    }

    public void nightmodegallery(View view) {
        CheckBox chk = (CheckBox) findViewById(R.id.nightmodegallery);
        ScrollView scv = (ScrollView) findViewById(R.id.scrollgallery);
        boolean p = chk.isChecked();
        if (p) {
            scv.setBackgroundColor(Color.parseColor("#000000"));
        }
        if (!p) {
            scv.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }
}
