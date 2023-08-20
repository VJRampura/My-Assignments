class CException extends Exception{}
class WException extends CException{}
class W{
	void m1() throws CException {throw new CException();}
	void m2() throws WException {throw new WException();}
	public static void main(String args[]) throws CException{
		W w = new W();
		int a,b,d,f;
		a=b=d=f=0 ;
		try{
			w.m1();
			a++;
		}
		catch(CException e1){
			b++;
			System.out.println("WE");
		}
		try{
			w.m2();
			d++;
		}
		catch(WException e2){
			System.out.println("WE1");
			f++;
		}
		System.out.println(a+","+b + ","+d + ", "+ f);
		
	}
}