package com.example.sharepreference;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private SharedPreferences preference = null;
	private SharedPreferences.Editor editor = null;
	
	Button bt_save;
	Button bt_show;
	EditText tv_save;
	EditText tv_show;
	
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.bt_save:
				String  s = tv_save.getText().toString().trim();
				editor.putString("key", s);
				editor.commit();
				break;
			case R.id.bt_show:
				String s1 = preference.getString("key", "123");
				tv_show.setText(s1);
				break;
				
			default:
				break;
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		preference = getSharedPreferences("setting_files",this.MODE_PRIVATE);
		editor = preference.edit();
		bt_save = (Button)this.findViewById(R.id.bt_save);
		bt_save.setOnClickListener(listener);
		bt_show = (Button)this.findViewById(R.id.bt_show);
		bt_show.setOnClickListener(listener);
		tv_save = (EditText)this.findViewById(R.id.editText_save);
		tv_show = (EditText)this.findViewById(R.id.editText_show);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
