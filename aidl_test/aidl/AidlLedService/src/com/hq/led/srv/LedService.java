package com.hq.led.srv;
//2018/10/12
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class LedService extends Service{

	//其实入口
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		System.out.println("-----service start\n");
		Log.d("cli", "services start\n");
		super.onCreate();
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		Log.d("cli", "services bind\n");
		// TODO Auto-generated method stub
		return  new LedManagerImpl();
	}
	
	@Override
	public boolean onUnbind(Intent intent) {
		Log.d("cli", "services unbind\n");
		// TODO Auto-generated method stub
		return super.onUnbind(intent);
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

}
