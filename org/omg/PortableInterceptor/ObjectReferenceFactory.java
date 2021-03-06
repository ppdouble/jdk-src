package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceFactory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /builddir/build/BUILD/java-1.8.0-openjdk-1.8.0.232.b09-0.fc29.x86_64/openjdk/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, October 16, 2019 2:34:12 PM UTC
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public interface ObjectReferenceFactory extends org.omg.CORBA.portable.ValueBase
{

  /** make_object creates a CORBA object reference according
      * to the data in this template, with the given repository ID and
      * object ID.
      */
  public abstract org.omg.CORBA.Object make_object (String repositoryId, byte[] object_id);

} // interface ObjectReferenceFactory
