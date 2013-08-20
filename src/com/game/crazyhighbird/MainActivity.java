package com.game.crazyhighbird;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button button_start, button_shop, button_achievement, button_setting, button_help, button_exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//隐去标题栏（应用程序的名字）  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //隐去状态栏部分(电池等图标和一切修饰部分)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_main);
		button_start = (Button)findViewById(R.id.button_start);
		button_start.setOnClickListener(this);
		button_shop = (Button)findViewById(R.id.button_shop);
		button_shop.setOnClickListener(this);
		button_achievement = (Button)findViewById(R.id.button_achievement);
		button_achievement.setOnClickListener(this);
		button_setting = (Button)findViewById(R.id.button_setting);
		button_setting.setOnClickListener(this);
		button_help = (Button)findViewById(R.id.button_help);
		button_help.setOnClickListener(this);
		button_exit = (Button)findViewById(R.id.button_exit);
		button_exit.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if (v == button_start) {
			//创建一个意图，并且设置需打开的Activity
			Intent intent = new Intent(MainActivity.this, GameActivity.class);
			//发送数据 
			intent.putExtra("Main", "开始玩游戏！");
			//启动另外一个Activity
			this.startActivity(intent);
		} 
		else if (v == button_shop) {
			Intent intent = new Intent(MainActivity.this, ShopActivity.class);
			intent.putExtra("Main", "快点买东西！");
			this.startActivity(intent);
		}
		else if (v == button_achievement) {
			Intent intent = new Intent(MainActivity.this, AchievementActivity.class);
			intent.putExtra("Main", "看一下成就！");
			this.startActivity(intent);
		}
		else if (v == button_setting) {
			Intent intent = new Intent(MainActivity.this, SettingActivity.class);
			intent.putExtra("Main", "改一下设置！");
			this.startActivity(intent);
		}
		else if (v == button_help) {
			Intent intent = new Intent(MainActivity.this, HelpActivity.class);
			intent.putExtra("Main", "找一下帮助！");
			this.startActivity(intent);
		}
		else System.exit(0);//退出程序
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	

}