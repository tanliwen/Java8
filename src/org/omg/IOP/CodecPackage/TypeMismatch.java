package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/TypeMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/wsjdk/Corretto8Src/installers/windows/zip/corretto-build/buildRoot/src/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, January 13, 2022 11:39:15 PM UTC
*/

public final class TypeMismatch extends org.omg.CORBA.UserException
{

  public TypeMismatch ()
  {
    super(TypeMismatchHelper.id());
  } // ctor


  public TypeMismatch (String $reason)
  {
    super(TypeMismatchHelper.id() + "  " + $reason);
  } // ctor

} // class TypeMismatch