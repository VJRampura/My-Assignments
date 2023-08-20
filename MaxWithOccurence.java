class MaxWithOccurence {
	public static void main(String args[]){
		int no, i = 10, cnt = 1, max = 0 ;
		System.out.print("Generated Numbers Are : ");
		while(i >= 1){
			no = (int)(Math.random() * 10);
			System.out.print(no + " ");
			if (no == max){
				cnt++;
			}else if (no > max){
				cnt = 1 ;
				max = no ;
			}
			i--;
		}
		
		System.out.println("\nMaximum Value Is : " + max + " Occured "+ cnt +" Times in Numbers Series");
	
	}

}