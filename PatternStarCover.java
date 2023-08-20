public class PatternStarCover{
	public static void main(String args[]) {
		int a = 6 ,b = 1,no;
		System.out.println("*");
		System.out.println("**");
		for(int i = 0 ; i <= a ; i++){
				
			for(int j = 0 ; j < a/2+i ; j++){
				if(j == 0 | j == (a/2+i-1))
					System.out.print("*");
				else
					if(i == a)
					System.out.print("*");				
				else
					System.out.print(a-j+1);				
			}
			
			System.out.println();				
				
		}
	}	
	
}