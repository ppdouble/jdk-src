package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.232.b09-0.fc29.x86_64/openjdk/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, October 16, 2019 2:34:12 PM UTC
*/


/**
   * Provides the server-side ORB service with access to the applicable 
   * policies during IOR construction and the ability to add components. 
   * The ORB passes an instance of its implementation of this interface as 
   * a parameter to <code>IORInterceptor.establish_components</code>.
   *
   * @see IORInterceptor
   */
public interface IORInfo extends IORInfoOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface IORInfo