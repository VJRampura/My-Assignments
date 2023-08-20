class SingleDigitFactorial {
	public static void main(String args[]){
		int no,i ;
		no = (int)(Math.random() * 10);
		System.out.println("The Factorial Number Is : " + no);
		for(i = no ; i > 1 ; i-- ){
			no = no * (i-1) ;
		}
		System.out.print("The Factorial Of This Number Is : " + no);
	}
}