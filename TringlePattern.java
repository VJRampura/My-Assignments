class TringlePattern {
	public static void main(String args[]){
		int i,j,no ;
		no = (int)(Math.random() * 10);
		
		for (i = 1 ; i <= no ; i++){   //this loop is for Rows.
			for (j = no-i ; j>= 1 ; j--)     //this loop is for adding double speces until loop's end
				System.out.print("  ");
			
			for (j = 1 ; j<= i ; j++ )      //this is for adding increasing digits value after adding speces.
				System.out.print(j + " ");

			for (j = i-1 ; j>= 1 ; j-- )   // this is for adding decreasing digits value after adding increasing digits
				System.out.print(j+ " ");
			
			System.out.println();
	
		}
	}
}

		