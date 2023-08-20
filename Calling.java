class A {
	public void call (){
		System.out.println("this is a A class's Call method");
	}
	public void sms() {
		System.out.println("this is a A class's Sms method");
	}
	
}
class B extends A {
	public void call (){
		System.out.println("this is a B class's Call method");
	}
	public void smsB() {
		super.sms();
		System.out.println("this is a B class's Sms method");
	}
	
	
}
class C extends B {
	public void call (){
		System.out.println("this is a C class's Call method");
	}
	public void sms() {
		System.out.println("this is a C class's Sms method");
	}
	
	
}
class D extends C {
	public void call (){
		System.out.println("this is a D class's Call method");
	}
	public void smsD() {
		System.out.println("this is a D class's Sms method");
	}
	
	
}
