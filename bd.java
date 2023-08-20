import java.io.* ;
class bd {
	public static void main(String args[]){
		int i=0,j=5,sr = 1,no;
			Console cn = System.console();
			cn.printf("Enter Series(1, 6, 13, 22, 33, 46,..) Length :") ;
			no = Integer.parseInt(cn.readLine());
			cn.printf("Your series is : \n");
			cn.printf(sr +", ");
			for(i = 1; i < no ; i++){
				sr =  sr + j ;
				System.out.print(sr + ", ");
				j += 2 ;
			}	
	}

}