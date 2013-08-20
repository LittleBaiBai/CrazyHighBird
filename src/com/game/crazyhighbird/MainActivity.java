package com.game.crazyhighbird;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	OnClickListener listener_start = null;
	Button button_start;
	OnClickListener listener_shop = null;
	Button button_shop;
	OnClickListener listener_achievement = null;
	Button button_achievement;
	OnClickListener listener_setting = null;
	Button button_setting;
	OnClickListener listener_help = null;
	Button button_help;
	OnClickListener listener_exit = null;
	Button button_exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listener_start = new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, GameActivity.class);
			}
		};
		listener_shop = new OnClickListener() {
			public void onClick(View v) {
				;
			}
		};
		listener_achievement = new OnClickListener() {
			public void onClick(View v) {
				;
			}
		};
		listener_setting = new OnClickListener() {
			public void onClick(View v) {
				;
			}
		};
		listener_help = new OnClickListener() {
			public void onClick(View v) {
				;
			}
		};
		listener_exit = new OnClickListener() {
			public void onClick(View v) {
				;
			}
		};
		setContentView(R.layout.activity_main);
		button_start = (Button)findViewById(R.id.button_start);
		button_start.setOnClickListener(listener_start);
		button_start = (Button)findViewById(R.id.button_shop);
		button_start.setOnClickListener(listener_shop);
		button_start = (Button)findViewById(R.id.button_achievement);
		button_start.setOnClickListener(listener_achievement);
		button_start = (Button)findViewById(R.id.button_setting);
		button_start.setOnClickListener(listener_setting);
		button_start = (Button)findViewById(R.id.button_help);
		button_start.setOnClickListener(listener_help);
		button_start = (Button)findViewById(R.id.button_exit);
		button_start.setOnClickListener(listener_exit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
