package com.example.showpopup;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.PopupMenu;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {

	TabHost host;
	TabSpec spec1,spec2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		host=(TabHost)findViewById(android.R.id.tabhost);
		host.setup();
		spec1=host.newTabSpec("tab1");
		spec1.setContent(R.id);
		spec1.setIndicator("Activity1");
		
		spec2=host.newTabSpec("tab2");
		spec2.setIndicator("Activity2");
	}
    public void showPopupMenu(View v){
    	PopupMenu pop=new PopupMenu(this,v);
    	pop.getMenuInflater().inflate(R.menu.popupmenu, pop.getMenu());
    	pop.show();
    	
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
