package TestApp;


/**
* TestApp/_testImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from test.idl
* 05 March 2018 16:53:26 o'clock GMT
*/

public abstract class _testImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements TestApp.test, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _testImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sayHello", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // TestApp/test/sayHello
       {
         String message = in.read_string ();
         String $result = null;
         $result = this.sayHello (message);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:TestApp/test:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _testImplBase
