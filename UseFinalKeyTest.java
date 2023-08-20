class FinalKeyTester{
	private int x ;
	private int y ;
	static private int [] z = new int[5];
	static{	for(int i=0 ;i< z.length;i++)
		z[i] = (int)(Math.random()*100);}
	public FinalKeyTester(){
	}
	public void FinalKeyTester(){
		for(int i : z)
		System.out.println(i);
	}
	
}
public class UseFinalKeyTest{
	public static void main(String args[]){
		FinalKeyTester f = new FinalKeyTester();
		FinalKeyTester g = new FinalKeyTester();
		f.FinalKeyTester();
		g.FinalKeyTester();
		
	}
} 