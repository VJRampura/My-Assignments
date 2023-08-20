class FinalKeyTesting{
	private int x ;
	private int y ;
	private int [] z = new int[5];
	{	for(int i : z)
		i = (int)(Math.random()*100);}
	public FinalKeyTesting(){
		for(int i : z)
		System.out.println(i);
	}
}
public class FinalKeyTest{
	public static void main(char args[]){
		FinalKeyTest f = new FinalKeyTest();
	}
} 