package com.example.ui2;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button);
		
		
		
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//showCustomDialog();
				Intent  intent = new Intent();
				//intent.setAction("com.second");
				intent.setClassName("com.example.activity","com.example.activity.second");
				MainActivity.this.startActivity(intent);
				
			}
		});
	}


	private void showCustomDialog() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder;
		AlertDialog alertDialog;
		Context mContext = MainActivity.this;
		// 下面俩种方法都可以
		// //LayoutInflater inflater = getLayoutInflater();
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.custom_dialog, null);

		TextView text = (TextView) layout.findViewById(R.id.text);
		text.setText("123123");

		//ImageView image = (ImageView) layout.findViewById(R.id.image);
		//image.setImageResource(R.drawable.ic_launcher);

		builder = new AlertDialog.Builder(mContext);
		builder.setView(layout);
		
		builder.setTitle("this is title");
		
		alertDialog = builder.create();
		alertDialog.show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
