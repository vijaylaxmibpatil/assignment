package com.example.vijaylaxmi.assignment;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class whatsapp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost th = (TabHost) findViewById(R.id.tabhost);
        th.setup();

        TabSpec specs =th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("MESSAGES");
        th.addTab(specs);

        specs =th.newTabSpec("tag2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("STATUS");
        th.addTab(specs);

        specs =th.newTabSpec("tag3");
        specs.setContent(R.id.tab3);
        specs.setIndicator("CALLS");
        th.addTab(specs);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        switch(item.getItemId()) {
            case R.id.group:
                Toast.makeText(this, "New group",Toast.LENGTH_LONG).show();

                break;

            case R.id.broadcast:
                Toast.makeText(this, "New Broadcast",Toast.LENGTH_LONG).show();
                break;

            case R.id.web:
                Toast.makeText(this, "Whatsapp Web",Toast.LENGTH_LONG).show();
                break;

            case R.id.messages:
                Toast.makeText(this, "Starred Messages",Toast.LENGTH_LONG).show();
                break;

            case R.id.Settings:
                Toast.makeText(this, "Settings",Toast.LENGTH_LONG).show();
                break;
        }

        return false;
    }

}
