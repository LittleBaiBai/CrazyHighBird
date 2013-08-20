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
		//��ȥ��������Ӧ�ó�������֣�  
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //��ȥ״̬������(��ص�ͼ���һ�����β���)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		tv = new TextView(this); 
		setContentView(tv); 
		//�õ���ǰActivity����ͼ
		Intent intent = this.getIntent();
		//��ȡ����
		String str = intent.getStringExtra("Main");
		//����ȡ�����������ó�TextView���ı�
		tv.setText(str);
	}
}
