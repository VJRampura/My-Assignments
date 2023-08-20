class ZeroOneIncreasingPattern {
	public static void main(String args[]){
		int i, j = 1, k = 0, no, cnt = 1 ;
		no = (int)(Math.random() * 10);
		for(i = 1; i <= no ; i++ ){
			while(j <= i){
				System.out.print(k+" ");
				cnt++;
				j++ ;
				if((cnt % 2) == 0){
					k = 1 ;
				}else{
					k = 0 ;
				}
			}
			j = 1 ;
			System.out.println();
		}
	}

}