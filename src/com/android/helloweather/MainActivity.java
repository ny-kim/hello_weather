package com.android.helloweather;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends SherlockActivity {

	private ActionBar mActionBar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        
        mActionBar=getSupportActionBar();
        mActionBar.setTitle(R.string.app_name);
    }

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		MenuInflater inflater=getSupportMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.action_add:
			// Do something...
			return true;
		case R.id.action_settings:
			// Do something...
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}