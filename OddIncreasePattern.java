class OddIncreasePattern {
	public static void main(String args[]){
		int i, j, no ;
		no = (int)(Math.random() * 10);
		System.out.print("Generated Number Is: " + no+ "\n");
		for(i = 1; i <= no; i++){
			for(j = 1; j <= (i+i-1) ; j++)
			System.out.print(i+" ");
			System.out.println();
		}
	}


}