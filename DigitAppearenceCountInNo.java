class DigitAppearenceCountInNo {
	public static void main(String args[]){
		int noA, noB, rem = 0, cnt = 0 ;
		noA = (int)(Math.random() * 100000);
		noB = (int)(Math.random() * 10);
		System.out.println("The Number Is: " + noA + " And The Digit Is: " + noB);
		do{
			rem = noA % 10 ;
			if (rem == noB)
			   cnt++ ;
			noA = noA / 10 ;	
		}while(noA > 0);
		System.out.print("Digit Appeared In Number For: " + cnt);
	}

}