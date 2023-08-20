public class DiamondPattern{
	public static void main(String args[]) {
		for(int r = 0; r < 5; r++){
		int a = 43 ;
		int b= a/2 ,no = 1;
		for(int i = 1 ; i <= a ; i++){
			for(int j = 1 ; j <= b ; j++){
					System.out.print(" ");			
			}
			
			for(int k = 1 ; k <= no ; k++){
					System.out.print("*");			
								
			}
			System.out.println();				
				
			if(i <= a/2){
				no += 2;
				b = b-1;
			}	
			else{
				no= no-2;
				b= b+ 1;
			}	
		}
		 a = a+10 ;
		 b= a/2 ;no = 1;
		}
	}	
	
}