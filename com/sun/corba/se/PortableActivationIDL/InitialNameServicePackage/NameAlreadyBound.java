package com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage;


/**
* com/sun/corba/se/PortableActivationIDL/InitialNameServicePackage/NameAlreadyBound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.232.b09-0.fc29.x86_64/openjdk/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, October 16, 2019 2:34:11 PM UTC
*/

public final class NameAlreadyBound extends org.omg.CORBA.UserException
{

  public NameAlreadyBound ()
  {
    super(NameAlreadyBoundHelper.id());
  } // ctor


  public NameAlreadyBound (String $reason)
  {
    super(NameAlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyBound
