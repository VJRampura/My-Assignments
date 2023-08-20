class PallindromeNumbers {
	public static void main(String args[]){
		int i, no, rev = 0 , rem ;
		System.out.print("Pallindrome Numbers Are : ");
		for (i = 1; i <= 200 ; i++){
			no = i ;
			while(no > 0){
				rem = no % 10 ;
				rev = rev * 10 + rem ;
				no = no / 10 ;
			}
			if (i == rev)
			System.out.print(rev + " ");
			rev = 0 ;
		}
	}

}