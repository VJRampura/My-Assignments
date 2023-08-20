import java.io.* ;
class ByteCoding {
	public static void main(String args[]){
		Console cn = System.console();
		ArrayS as = new ArrayS();

	//Q1... MAX and MIN...

		/*int max = 0, min = 99, a ;
		for(int i = 0 ; i < 4 ; i++){
			a = (int)(Math.random() * 100);
			cn.printf(" " +a) ;	
			if (a > max)
				max = a ;
			if(a < min)
				min = a ;
			
		}
		cn.printf(" Max is : "+ max + " And Min is : " + min);*/

	//Q2...3rd Max...

		/*int a[] = new int[4], max = 0, min = 0 ;
		for(int i = 0 ; i < 4 ; i++){
			a[i] = (int)(Math.random() * 100);
			cn.printf(" " +a[i]) ;
		}
		as.sortA(a) ;
		cn.printf("\n" + a[0] + " " + a[1] + " " + a[2] + " " +a[3]);
		cn.printf("Third Max is : "+ a[2]);*/	
		
	//Q2...3rd Min...

		int a[] = new int[4];
		for(int i = 0 ; i < 4 ; i++){
			a[i] = (int)(Math.random() * 100);
			cn.printf(" " +a[i]) ;
		}
		as.sortD(a) ;
		cn.printf("\n" + a[0] + " " + a[1] + " " + a[2] + " " +a[3]);
		cn.printf("Third Min is : "+ a[1]);
		
	}

}
