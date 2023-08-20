class StarReversePattern {
	public static void main(String args[]){
		int no, i, j, k ;
		no = (int)(Math.random() * 10);
		for(i = 1 ; i <= no ; i++){
			for(j = 1; j <= no-i ; j++)
				System.out.print("  ");
			for(k = 1 ; k <= i ; k++)
				System.out.print("* ");
				System.out.println();
		}

	}

}