package com.example.android.delhihistory;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.TextView;

public class aboutDelhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_delhi);
    }

    public void nightmode(View view) {
        TextView txt = (TextView) findViewById(R.id.textdelhi);
        View full = findViewById(R.id.bigview);
        CheckBox chk = (CheckBox) findViewById(R.id.chk);
        boolean a = chk.isChecked();
        if (a) {
            txt.setTextColor(Color.parseColor("#ffffff"));
            txt.setBackgroundColor(Color.parseColor("#000000"));
            full.setBackgroundColor(Color.parseColor("#000000"));
        }
        if (!a) {
            txt.setTextColor(Color.parseColor("#000000"));
            txt.setBackgroundColor(Color.parseColor("#ffffff"));
            full.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }
    public void largetext(View view) {
        TextView txt2 = (TextView) findViewById(R.id.textdelhi);
        CheckBox chk2 = (CheckBox) findViewById(R.id.chk2);
        boolean a = chk2.isChecked();
        if (a) {
            txt2.setTextSize(30);

        }
        if (!a) {
            txt2.setTextSize(20);

        }
    }
}
