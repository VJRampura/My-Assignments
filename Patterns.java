import java.io.* ;
class Patterns {
	public static void main(String args[]){
		int i, j, k ;

	//Pattern 1 ....

		/*for(i = 1; i < 6 ;i++){
			for(j = 5-i ; j > 0; j--)
				System.out.print(" ") ;

			for(j = i ; j >= 1; j--)
				System.out.print(j) ;
			System.out.println() ;
		}*/

	//Pattern 2 ....

		/*for(i = 5; i > 0 ;i--){
			for(j = i ; j < 5; j++)
				System.out.print(" ") ;

			for(j = i ; j > 0; j--)
				System.out.print(j) ;
			System.out.println() ;
		}*/

	//Pattern 3 ....

		/*k = 10 ;
		for(i = 1; i < 6 ;i++){
			for(j = 1 ; j < k; j++)
				System.out.print(" ") ;
			for(j = i ; j > 1; j--)
				System.out.print(j) ;

			for(j = 1 ; j <= i; j++)
				System.out.print(j) ;
			System.out.println() ;
			k = k-2 ;
		}*/

	//Pattern 4 ....

		/*for(i = 1; i < 6 ;i++){
			for(j = i ; j > 1; j--)
				System.out.print(j) ;

			for(j = 1 ; j <= 6-i; j++)
				System.out.print(j) ;
			System.out.println() ;
			
		}*/

	//Pattern 5 ....

		k = 7 ;
		for(i = 1; i < 6 ;i++){
			for(j = 1 ; j <= i; j++)
				System.out.print(j) ;
			for(j = 1 ; j <= k; j++)
				System.out.print(" ") ;
			if(i == 5)
				j = i-1;
			else
				j = i ;	
			for(; j >= 1; j--)
				System.out.print(j) ;
			
			System.out.println() ;
			k = k-2 ;
			
		}
		
	}
}