package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class second extends Activity{

	
	TextView tv1 ;
	Button bt;
	String str = "";
	
	
	OnClickListener listener = new OnClickListener() {
		
		Intent  intent = new Intent();
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			// 启动第二个activity
			//显式启动
			intent.setClass(second.this, MainActivity.class);		
			//intent = new Intent(MainActivity.this, SecondActivity.class);
			// 隐试
			//intent.setAction("com.example.activity.MainActivity");
			second.this.startActivity(intent);	
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		tv1 = (TextView)this.findViewById(R.id.textView1);
		
		// 1,拿到intent
		//Intent intent = this.getIntent();
		//str += intent.getStringExtra("name") + "\n";
		//str += intent.getIntExtra("age", 3) + "\n";
		//str += intent.getStringExtra("sex") + "\n";
		//
		//Bundle bundle = intent.getBundleExtra("bundle");
		//str += bundle.getInt("test") + "\n";
		
		//bt = (Button) this.findViewById(R.id.button_return);
		//bt.setOnClickListener(listener);
		tv1.setText("hello welcome  to second  activity");
		
	}

}
