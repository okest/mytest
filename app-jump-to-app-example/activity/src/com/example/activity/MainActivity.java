package com.example.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {

	Button bt_next ;
	
	
	OnClickListener listener = new OnClickListener() {
		
		Intent  intent = new Intent();
		@Override
		public void onClick(View v) {
			
				// 启动第二个activity
				//显式启动
				//intent.setClass(MainActivity.this, second.class);		
				//intent = new Intent(MainActivity.this, SecondActivity.class);
				// 隐试
				intent.setAction("com.second");
				intent.putExtra("name", "jason");
				intent.putExtra("age", 18);
				intent.putExtra("sex", "男的");
				
				Bundle bundle = new Bundle();
				bundle.putInt("test", 9999);
				intent.putExtra("bundle", bundle);
				MainActivity.this.startActivity(intent);		
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bt_next =(Button)this.findViewById(R.id.button_next);
		bt_next.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
