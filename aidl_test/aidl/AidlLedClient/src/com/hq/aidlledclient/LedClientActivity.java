package com.hq.aidlledclient;
//2018/10/12
import com.hq.remote.LedManager;

import android.R.bool;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

public class LedClientActivity extends Activity {
	// ����һ������˶���Ľӿ���
	LedManager ledManager = null;
	
	Button b_lianjie;
	Button b_open;
	Button b_close;
	
	boolean isbind = false;
	
	//���󶨳ɹ�����ʾ���ӳɹ����ɹ�֮���������
	ServiceConnection connection = new ServiceConnection() {
		
		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.e("cli", "---------------->unbind\n");
			ledManager = null;
		}
		
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			if(service != null){// services�Ƿ������ onBind()�д��ݹ�����
				Toast.makeText(LedClientActivity.this, "���ӷ���γɹ�", 1000).show();
				//������˴��ݹ����Ķ���ת���ɽӿڶ���
				ledManager = LedManager.Stub.asInterface(service);
				//Զ�̵��÷���˵Ľӿ�
				try {
					ledManager.remoteOpenDev();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_led_client);
	
		b_lianjie = (Button)findViewById(R.id.button_start);
		b_lianjie.setOnClickListener(listener);
		
		b_open = (Button)findViewById(R.id.button_open);
        b_open.setOnClickListener(listener);
        
        b_close = (Button)findViewById(R.id.button_stop);
        b_close.setOnClickListener(listener);
	}

	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId())
			{
				case R.id.button_start:
					//ֱ��ȥ����service
					Intent intent = new Intent();
					intent.setAction("com.hq.action.ledservice");
					LedClientActivity.this.bindService(intent, connection, Service.BIND_AUTO_CREATE);
					isbind = true;
					break;
				case R.id.button_open:
				try {
					if(ledManager != null)
					{
							Log.e("cli","---------cli  ctrol");
							ledManager.remoteControlDev();
					}
					if(ledManager == null)
					{
						Log.e("cli","û�����ӳɹ�");
					}
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					//ledManager.remoteCloseDev();
					break;
				case R.id.button_stop:
					if(isbind == true)
					{
						isbind = false;
						Log.e("cli","�Ͽ�����");
						unbindService(connection);
						ledManager = null;
					}
					break;
					
					
			}
		}
	};
	

}
