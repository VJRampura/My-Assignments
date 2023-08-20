class PrimeNumbers {
	public static void main(String args[]){
		int no, i, j = 2, rem ;
		System.out.print("The Prime Numbers Are: 2 3 ");
		for (i = 4 ; i <= 50; i++){
			do {
				rem = i % j;
				if (rem == 0 )
					j = i/2 ;
					j++ ;
				
			} while(j <= i/2);
			if(rem > 0)
				System.out.print(i+ " ");
				j = 2 ;
		}
		
	}
}