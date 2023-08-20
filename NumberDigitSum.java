class NumberDigitSum {
	public static void main(String args[]){
		int no, rem = 0 , digitSum = 0 ;
		no = (int)(Math.random() * 100000);
		System.out.println("The Number Is: " + no);
		while(no > 0){
			rem = no % 10 ;
			no = no / 10 ;
			digitSum = rem + digitSum ;
		}
		System.out.print("The Sum Of Its Digits Is: " + digitSum);
	
	}
}