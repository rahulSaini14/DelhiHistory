package com.example.android.delhihistory;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Links extends AppCompatActivity {


    public static final String tab_name_package = "com.android.browser";
    static final String URL_delhi_gov = "http://www.delhi.gov.in";
    static final String URL_delhi_pol = "http://www.delhipolice.nic.in";
    static final String URL_delhi_turism = "http://www.delhitourism.gov.in";
    CustomTabsClient mClient;
    CustomTabsSession mcustomTabsSession;
    CustomTabsServiceConnection mcustomTabsServiceConnection;
    CustomTabsIntent customTabsIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mcustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
                mClient = client;
                mClient.warmup(0L);
                mcustomTabsSession = mClient.newSession(null);
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                mClient = null;
            }
        };
        CustomTabsClient.bindCustomTabsService(Links.this, tab_name_package, mcustomTabsServiceConnection);
        customTabsIntent = new CustomTabsIntent.Builder(mcustomTabsSession)
                .setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary)).setShowTitle(true).build();
        Button btn1 = (Button) findViewById(R.id.delhig);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(Links.this, Uri.parse(URL_delhi_gov));
            }
        });
        Button btn2 = (Button) findViewById(R.id.delhipolice);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(Links.this, Uri.parse(URL_delhi_pol));
            }
        });
        Button btn3 = (Button) findViewById(R.id.delhitourism);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(Links.this, Uri.parse(URL_delhi_turism));
            }
        });

    }

}