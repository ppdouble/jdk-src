package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/EndPointInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.232.b09-0.fc29.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, October 16, 2019 2:34:11 PM UTC
*/

public final class EndPointInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String endpointType = null;
  public int port = (int)0;

  public EndPointInfo ()
  {
  } // ctor

  public EndPointInfo (String _endpointType, int _port)
  {
    endpointType = _endpointType;
    port = _port;
  } // ctor

} // class EndPointInfo
