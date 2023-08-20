class MaxMinInRandomNo {
	public static void main(String args[]){
		int num, max = 0, min = 99, i = 9, num1 = 0 ;
		System.out.print("Generated Numbers Are :");
		num = (int)(Math.random() * 100);
		num1 = num ;
		System.out.print(num+ " ");
		while(i >= 1){
			num = (int)(Math.random() * 100);
			System.out.print(num+ " ");
			if (num > num1){
				max = num ;
				if(min > num1)
				min = num1 ;
				num1 = max ;
			}else{
				max = num1 ;
				if(min > num)
				min = num ;
				
			}
			i--;	
		}
		System.out.println("Maximum Number Is: "+max + " And Minimum Number Is: "+ min);
	
	}

}