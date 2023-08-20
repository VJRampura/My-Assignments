import java.io.* ;
public class SquarePattern {
	public static void main(String args[]){
		int a , b, c;
		Console cn = System.console();
		cn.printf("Enter ");
		a = Integer.parseInt(cn.readLine());

	/*// Question : Square * Pattern ....

		for (int i = 1;i <= a ;i++ ){
			if(i == 1 | i == a )		
				for(int j = 1 ; j <= a ; j++)
					cn.printf("* ") ;
			else	
				for(int j = 1 ; j <= a ; j++)
					if(j == 1 | j == a )
						cn.printf("* ") ;
					else
						cn.printf("  ") ;
			cn.printf("\n");
		}

	// Question : Tringle * Pattern ....
		b = (a*2)-2 ;
		c = (a*2)-b ;		
		for (int i = 1;i <= a ;i++ ){
			for(int j = b ; j >= 1 ; j--)
				cn.printf(" ") ;
			for(int j = 1 ; j < c ; j++)
				cn.printf(" *") ;
			b = b-2;
			c = c+2 ;
			cn.printf("\n");
		}

	
	// Question : Tringle * Pattern ....
		
		b = (a*2)-2 ;
		c = (a*2)-b ;		
		for (int i = 1;i <= a ;i++ ){
			if(i != a){
			for(int j = b ; j >= 1 ; j--)
				cn.printf(" ") ;
			for(int j = 1 ; j < c ; j++)
				if(j == 1 | j == c-1 )
						cn.printf("* ") ;
					else
						cn.printf("  ") ;
			}else{
				for(int j = b ; j >= 1 ; j--)
					cn.printf(" ") ;
				for(int j = 1 ; j < c ; j++)
					cn.printf("* ") ;
			}
			b = b-2;
			c = c+2 ;
			cn.printf("\n");
		}


	// Question : right angled Tringle * Pattern ....
		
	 		
		for (int i = 1;i <= a ;i++ ){
			if(i == 1  | i == a){
				for(int j = 1 ; j <= i ; j++){
						cn.printf("*") ;
				}

				
			} else {
				for(int j = 1 ; j <= i+1 ; j++){
					if(j == 1 | j == i+1 )
						cn.printf("*") ;
					else
						cn.printf(" ") ;
				}
				
			}
			cn.printf("\n");
		}*/
		
			
	// Question : 'X' * Pattern ....
		c = 2 ;
		for(int i = 1  ; i < a*2 ; i++)
			
			if(i <= a){
				for(int j = 1 ; j < a*2 ; j++)

					if(j == i | j == (a*2-i) )
						cn.printf(i+"") ;
					else
						cn.printf(" ") ;
				

				cn.printf("\n");
				
			}else{
				for(int j = 1 ; j < a*2 ; j++)
					if(j == i-c | j == i )
						cn.printf((i-c)+"") ;
					else
						cn.printf(" ") ;
				
				cn.printf("\n");
				c+= 2;
				
			}		
		
	}
}