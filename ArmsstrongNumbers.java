class ArmsstrongNumbers {
	public static void main(String args[]){
		int no, i, j = 0, rem ;
		System.out.print("Armstrong Numbers Between 100 To 1000 Is : ");
		for(i = 100 ; i <= 1000 ; i++){
			no = i ;
			while(no > 0){
				rem = no % 10 ;
				j = rem * rem * rem + j ;
				no = no / 10 ;
			} 
			if (i == j)
				System.out.print(i + " ");
			j = 0 ;
		}	
	}
}