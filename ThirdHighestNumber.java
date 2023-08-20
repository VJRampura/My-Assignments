import java.io.* ;
class ThirdHighestNumber {
	public static void main(String args[]){
		Console cn = System.console();
		int secmin = 0, min = 0 ;
		cn.printf("Enter 4 Numbers : \n");
			int no = Integer.parseInt(cn.readLine());
			min = no ;
		for(int i = 0; i < 3; i++){
			no = Integer.parseInt(cn.readLine());
			if(min > no){
				secmin = min ;
				min = no ;
			}else{ 
				if(no < secmin)
					secmin = no;
			}	
				
		}
		
					
		cn.printf("Third Maximum Number Is : "+ secmin);

	}
}