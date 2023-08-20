class SuperPallindromeNumbers{
	public static void main(String args[]){
		int no, i, j, k, rev = 0, rem ;
		System.out.print("Super Pallindrome Values Are: ");
		for(i = 1 ; i <= 1000 ; i++){
			no = i ;
			while(no > 0){
				rem = no % 10 ;
				rev = rev * 10 + rem ;
				no = no / 10 ;
			}
			if (rev == i){
				for(k = 1; k < (i-1) ; k++)
				if (k*k == rev)
				System.out.print(rev+ " ");
			}
			rev = 0 ;
			
		}

	}
}