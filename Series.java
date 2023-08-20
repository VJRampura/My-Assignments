import java.io.* ;
class Series {
	public static void main(String args[]){
		int a, b, c ;

	//Series 1 ....
		/*a = 1;
		b = 5 ;
		Console cn = System.console();
		System.out.print(a + "" );
		for(int i = 1; i < 10; i++){
			a += b;
			b += 2 ;
			System.out.print(", " + a );
		}*/

	//Series 2 ....
		/*a = 3; b = 4 ;
		System.out.print(a + "" );
		for(int i = 1; i < 10; i++){
			a += b;
			b *= 2 ;
			System.out.print(", " + a );
		}*/
	
	//Series 3 ...
		/*a = 1; b = 1 ;
		System.out.print(a + "" );
		for(int i = 1; i < 10; i++){
			a += b;
			b += 6*i ;
			System.out.print(", " + a );
		}*/

	//Series 4 ...
		a = 1; b = 11 ; c = 100 ;
		System.out.print(a + "" );
		for(int i = 1; i < 10; i++){
			a += b;
			b += c ;
			c = c * 10 ;
			System.out.print(", " + a );
		}	
	
	}

}