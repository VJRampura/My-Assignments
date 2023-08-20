class NumberIncreasingPattern {
	public static void main(String args[]) {
		int i, j = 1, no, k=0 ;
		no = (int)(Math.random() * 10);
		for (i = 1; i <= no ; i++){
			j = 1 ;
			while(j<=i){
				System.out.print(k+" ");
				k++ ;
				j++;
				if( k == 10)
				   k = 0 ;
			}
		System.out.println();
		}

	}

}