public class PatternIncreDecre{
	public static void main(String args[]) {
		int a = 5 ,b = 2,no;
		
		for(int i = 0 ; i <= a ; i++){
				no = a-i ;
			for(int j = 0 ; j < a*2-1 ; j++){
				if((no-j) > 0)
					System.out.print(no-j);
				else if((no-j) <= 0 && ((a*2-1)-j) <= no )
					System.out.print(b++);				
				else 
					System.out.print(" ");	
			}
			b= 1 ;
			System.out.println();				
				
		}
	}	
	
}