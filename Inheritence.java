class A{
	int x ;
	public void run(){
		x = 1 ;
	}
	public void show(){
		System.out.println("hello A");
	}
}
class B extends A{
	int y;
	public void run(){
		y = 10 ;
	}
	public void show(){
		System.out.println("hello B");
	}
}
class C extends A {
	int z ;
	public void run(){
		z = 20;
		
	}
	public void show(){
		System.out.println("hello C" + x);
	}
	
}
