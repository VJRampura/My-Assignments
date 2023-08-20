class UseCalling{
	public static void main(String args[]){
		//   1....
		A a ;
		System.out.println("A classe object created");

		//we can create objects of all subclasses which is connected to superclass through Multilevel inheritence.
		a = new A();
		System.out.println("\nA class reference and A class object \n");
		a.call();
		a.sms();
		//a.smsB();		//Error 'can not find symbol' bcs we can't call subclass method with the reference of super class.

		a = new B();
		System.out.println("\nA class reference and B class object \n");
		a.call();
		a.sms();			// it will call the A class's sms method .
		//a.smsB();		//Error bcs with subclss object in super class reference we call only common.

		a = new C();
		System.out.println("\nA class reference and C class object \n");
		a.call();
		a.sms();
		//a.smsB();		//Error bcs with subclss object in super class reference we call only common.

		a = new D();
		System.out.println("\nA class reference and D class object \n");
		a.call();
		a.sms();
		//a.smsD();		//Error bcs with subclss object in super class reference we call only common.

		//   2....
		B b ;
		System.out.println("\nB classe object created");

		//b = new A();	//Error ::> A Can not be converted to B
						// Error bcs can't do Downcasting(sub-class reference and super class object)

		b = new B();
		System.out.println("\nB class reference and B class object \n");
		b.call();
		b.sms();			// call A class sms bcs this is not overriding...
		b.smsB();		//first call super bcs we call that in B class smsB method

		b = new C();
		System.out.println("\nB class reference and C class object \n");
		b.call();
		b.sms();			// call A class sms bcs this is not overriding...
		b.smsB();


	}
}