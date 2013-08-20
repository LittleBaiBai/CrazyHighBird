package com.game.crazyhighbird;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class ShopActivity extends Activity {
	private TextView tv;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//隐去标题栏（应用程序的名字）  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //隐去状态栏部分(电池等图标和一切修饰部分)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		tv = new TextView(this); 
		setContentView(tv); 
		//得到当前Activity的意图
		Intent intent = this.getIntent();
		//获取数据
		String str = intent.getStringExtra("Main");
		//将获取到的数据设置成TextView的文本
		tv.setText(str);
	}
}
