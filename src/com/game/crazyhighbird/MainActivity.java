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
		//��ȥ��������Ӧ�ó�������֣�  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //��ȥ״̬������(��ص�ͼ���һ�����β���)
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
			//����һ����ͼ������������򿪵�Activity
			Intent intent = new Intent(MainActivity.this, GameActivity.class);
			//�������� 
			intent.putExtra("Main", "��ʼ����Ϸ��");
			//��������һ��Activity
			this.startActivity(intent);
		} 
		else if (v == button_shop) {
			Intent intent = new Intent(MainActivity.this, ShopActivity.class);
			intent.putExtra("Main", "���������");
			this.startActivity(intent);
		}
		else if (v == button_achievement) {
			Intent intent = new Intent(MainActivity.this, AchievementActivity.class);
			intent.putExtra("Main", "��һ�³ɾͣ�");
			this.startActivity(intent);
		}
		else if (v == button_setting) {
			Intent intent = new Intent(MainActivity.this, SettingActivity.class);
			intent.putExtra("Main", "��һ�����ã�");
			this.startActivity(intent);
		}
		else if (v == button_help) {
			Intent intent = new Intent(MainActivity.this, HelpActivity.class);
			intent.putExtra("Main", "��һ�°�����");
			this.startActivity(intent);
		}
		else System.exit(0);//�˳�����
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	

}