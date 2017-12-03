package com.example.asus410.mi_segunda_aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.widget.TabHost;

public class Intereses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("recibidas");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Monumentos ");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("enviadas");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Fiestas");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("perdidas");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Senderos");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }


}
