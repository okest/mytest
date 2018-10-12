package com.hq.led.srv;

import android.os.RemoteException;
import android.util.Log;
import com.hq.remote.LedManager;

public class LedManagerImpl extends LedManager.Stub{

	@Override
	public int remoteOpenDev() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("---in led service : remoteOpenDev()");
		Log.d("cli", "service¡¥Ω”\n");
		return 0;
	}

	@Override
	public int remoteControlDev() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("---in led service : remoteControlDev()");
		Log.d("cli", "serve------------∑¢ÀÕ\n");
		return 0;
	}

	@Override
	public int remoteCloseDev() throws RemoteException {
		System.out.println("---in led service : remoteCloseDev()");
		// TODO Auto-generated method stub
		return 0;
	}



}
