/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/android /android-rcs-ims-stack-read-only/core/src/com/orangelabs/rcs/service/api/client/messaging/IFileTransferSession.aidl
 */
package com.orangelabs.rcs.service.api.client.messaging;
/**
 * File transfer session interface
 */
public interface IFileTransferSession extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession
{
private static final java.lang.String DESCRIPTOR = "com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession interface,
 * generating a proxy if needed.
 */
public static com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession))) {
return ((com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession)iin);
}
return new com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession.Stub.Proxy(obj);
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
case TRANSACTION_getSessionID:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSessionID();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRemoteContact:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getRemoteContact();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSessionState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getSessionState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getFilename:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getFilename();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getFilesize:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getFilesize();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getFileThumbnail:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getFileThumbnail();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_isGroupTransfer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isGroupTransfer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isHttpTransfer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isHttpTransfer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getContacts:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getContacts();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_acceptSession:
{
data.enforceInterface(DESCRIPTOR);
this.acceptSession();
reply.writeNoException();
return true;
}
case TRANSACTION_rejectSession:
{
data.enforceInterface(DESCRIPTOR);
this.rejectSession();
reply.writeNoException();
return true;
}
case TRANSACTION_cancelSession:
{
data.enforceInterface(DESCRIPTOR);
this.cancelSession();
reply.writeNoException();
return true;
}
case TRANSACTION_resumeSession:
{
data.enforceInterface(DESCRIPTOR);
this.resumeSession();
reply.writeNoException();
return true;
}
case TRANSACTION_addSessionListener:
{
data.enforceInterface(DESCRIPTOR);
com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener _arg0;
_arg0 = com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener.Stub.asInterface(data.readStrongBinder());
this.addSessionListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeSessionListener:
{
data.enforceInterface(DESCRIPTOR);
com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener _arg0;
_arg0 = com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener.Stub.asInterface(data.readStrongBinder());
this.removeSessionListener(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.orangelabs.rcs.service.api.client.messaging.IFileTransferSession
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
// Get session ID

@Override public java.lang.String getSessionID() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSessionID, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get remote contact

@Override public java.lang.String getRemoteContact() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRemoteContact, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get session state

@Override public int getSessionState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSessionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get filename

@Override public java.lang.String getFilename() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFilename, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get file size

@Override public long getFilesize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFilesize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get file thumbnail

@Override public byte[] getFileThumbnail() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getFileThumbnail, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Is group transfer

@Override public boolean isGroupTransfer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isGroupTransfer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Is HTTP transfer

@Override public boolean isHttpTransfer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isHttpTransfer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get list of contacts (only for group transfer)

@Override public java.util.List<java.lang.String> getContacts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getContacts, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Accept the session invitation

@Override public void acceptSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_acceptSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Reject the session invitation

@Override public void rejectSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_rejectSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Cancel the session

@Override public void cancelSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Resume the session (only for HTTP transfer)

@Override public void resumeSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resumeSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Add session listener

@Override public void addSessionListener(com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addSessionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Remove session listener

@Override public void removeSessionListener(com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeSessionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getSessionID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getRemoteContact = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getSessionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getFilename = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getFilesize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getFileThumbnail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isGroupTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isHttpTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getContacts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_acceptSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_rejectSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_cancelSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_resumeSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addSessionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_removeSessionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
}
// Get session ID

public java.lang.String getSessionID() throws android.os.RemoteException;
// Get remote contact

public java.lang.String getRemoteContact() throws android.os.RemoteException;
// Get session state

public int getSessionState() throws android.os.RemoteException;
// Get filename

public java.lang.String getFilename() throws android.os.RemoteException;
// Get file size

public long getFilesize() throws android.os.RemoteException;
// Get file thumbnail

public byte[] getFileThumbnail() throws android.os.RemoteException;
// Is group transfer

public boolean isGroupTransfer() throws android.os.RemoteException;
// Is HTTP transfer

public boolean isHttpTransfer() throws android.os.RemoteException;
// Get list of contacts (only for group transfer)

public java.util.List<java.lang.String> getContacts() throws android.os.RemoteException;
// Accept the session invitation

public void acceptSession() throws android.os.RemoteException;
// Reject the session invitation

public void rejectSession() throws android.os.RemoteException;
// Cancel the session

public void cancelSession() throws android.os.RemoteException;
// Resume the session (only for HTTP transfer)

public void resumeSession() throws android.os.RemoteException;
// Add session listener

public void addSessionListener(com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener listener) throws android.os.RemoteException;
// Remove session listener

public void removeSessionListener(com.orangelabs.rcs.service.api.client.messaging.IFileTransferEventListener listener) throws android.os.RemoteException;
}
