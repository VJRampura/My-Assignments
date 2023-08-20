class IncreasingPattern {
	public static void main(String args[]){
		int i, j, no ;
		no = (int)(Math.random() * 10);
		for (i = 1; i <= no ; i++){
			for(j = 1; j <= i ; j++){
				System.out.print(i + " ");
			}
				System.out.println();
			
		}
	}
}