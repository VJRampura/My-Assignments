class AOne extends Thread{
	public void run(){
		for(int i = 1 ; i <=10;i++)
		System.out.println("hi i am first");
	}
	public void show(){
		for(int i = 1 ; i <=10;i++)
		System.out.println("hi i am show");
	}
}
class BTwo extends Thread{
	public void run(){
		//Thread.yield();
		for(int i = 1 ; i <=10;i++)
		System.out.println("hi i am second");
	}
}
class CThree extends Thread{
	public void run(){
		for(int i = 1 ; i <=10;i++)
		System.out.println("hi i am Third");
	}
}
public class UseThread{
	public static void main(String args[]){
		AOne o = new AOne();
		o.start();
		//Thread.yield();
		BTwo t = new BTwo();
		t.start();
		CThree th = new CThree();
		th.start();
		o.show();
		for(int i = 1 ; i <=10;i++)
		System.out.println("hi i am Main");
		
	}
}