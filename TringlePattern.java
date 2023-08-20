class TringlePattern {
	public static void main(String args[]){
		int i,j,k,no ;
		no = (int)(Math.random() * 10);
		
		for (i = 1 ; i <= no ; i++){
			for (j = no-i ; j>= 1 ; j--)
				System.out.print("  ");
			
			for (j = 1 ; j<= i ; j++ )
				System.out.print(j + " ");

			for (j = i-1 ; j>= 1 ; j-- )
				System.out.print(j+ " ");
			
			System.out.println();
	
		}
	}
}

		