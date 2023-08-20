import java.io.* ;
class IncreaseSeriesCount {
	public static void main(String args[]){
		Console cn = System.console();
		int no,i,prev = 0 ,cnt = 0, j = 0 ;
		System.out.print("Generated Values Are :");
		for (i = 1 ; i <= 10 ; i++){
			no = Integer.parseInt(cn.readLine());
			//no = (int)(Math.random() * 100);
			//System.out.print(no + " ");
			if (no > prev){
			prev = no ;
			cnt++ ;
			}else{
				if(j < cnt){
				 j = cnt;
				prev = no ;
				cnt = 1 ;
				}
				prev = no ;
				cnt = 1 ;
			}
			
		}
			if (j<= cnt){
			System.out.println("\n Longest Increasing Series Length Is : " + cnt);
			}else{
			System.out.println("\n Longest Increasing Series Length Is : " + j);
			}

	}

}