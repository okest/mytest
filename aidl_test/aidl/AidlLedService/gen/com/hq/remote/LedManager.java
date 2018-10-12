/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\安卓开发\\测试代码\\AidlLedService\\src\\com\\hq\\remote\\LedManager.aidl
 */
package com.hq.remote;
public interface LedManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.hq.remote.LedManager
{
private static final java.lang.String DESCRIPTOR = "com.hq.remote.LedManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.hq.remote.LedManager interface,
 * generating a proxy if needed.
 */
public static com.hq.remote.LedManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.hq.remote.LedManager))) {
return ((com.hq.remote.LedManager)iin);
}
return new com.hq.remote.LedManager.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_remoteOpenDev:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.remoteOpenDev();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_remoteControlDev:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.remoteControlDev();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_remoteCloseDev:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.remoteCloseDev();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.hq.remote.LedManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int remoteOpenDev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_remoteOpenDev, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int remoteControlDev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_remoteControlDev, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int remoteCloseDev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_remoteCloseDev, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_remoteOpenDev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_remoteControlDev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_remoteCloseDev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public int remoteOpenDev() throws android.os.RemoteException;
public int remoteControlDev() throws android.os.RemoteException;
public int remoteCloseDev() throws android.os.RemoteException;
}
