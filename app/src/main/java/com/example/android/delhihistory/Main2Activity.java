package com.example.android.delhihistory;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ViewPager menupage = (ViewPager) findViewById(R.id.viewpagerMenu);
        MenuAdapter menuAdapter = new MenuAdapter(getSupportFragmentManager());
        menupage.setAdapter(menuAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.menutab);
        tabLayout.setupWithViewPager(menupage);
    }

    public void about(View view) {
        Intent abt = new Intent(this, aboutDelhi.class);
        startActivity(abt);
    }

    public void historical(View view) {
        Intent history = new Intent(this, historicalplaces.class);
        startActivity(history);
    }

    public void link(View view) {
        Intent lnk = new Intent(this, Links.class);
        startActivity(lnk);
    }

    public void otherapp(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(Main2Activity.this);
        alert.setView(R.layout.otherappsalert);
        alert.show();

    }

    public void map(View view) {
        Intent location = new Intent(this , Map.class);
            startActivity(location);
    }

    public void gallery(View view) {
        Intent glry = new Intent(this, Gallery.class);
        startActivity(glry);
    }

    public void setting(View view) {
        Intent stg = new Intent(this, settings.class);
        startActivity(stg);
    }

    public void aboutus(View view) {
        Intent abt = new Intent(this, aboutus.class);
        startActivity(abt);
    }


    public void share(View view) {

        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filepath = app.sourceDir;
        Intent shareapp = new Intent(Intent.ACTION_SEND);
        shareapp.setType("*/*");
        shareapp.setPackage("com.android.bluetooth");
        shareapp.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filepath)));
        startActivity(shareapp);
    }
}
