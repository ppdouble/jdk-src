package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerIdsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.232.b09-0.fc29.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, October 16, 2019 2:34:11 PM UTC
*/

public final class ServerIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public ServerIdsHolder ()
  {
  }

  public ServerIdsHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerIdsHelper.type ();
  }

}
