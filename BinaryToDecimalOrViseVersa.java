import java.io.*;
class BinaryToDecimalOrViseVersa {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Enter A Binary Or A Decimal Value : \n");
		String str = "" ;
		int rem = 0 ;
		int no = Integer.parseInt(cn.readLine());
		cn.printf("Enter '1' For D-To-B,Else Enter '2' : \n");
		int opt = Integer.parseInt(cn.readLine());
		if(opt == 1){

			while(no > 0 ){
				rem = no % 2 ;
				str = str + rem ;
				no = no/2 ;
				//cn.printf(str + " ");
			}
			int i = str.length()-1 ;
			while(i >= 0){
				cn.printf(str.charAt(i)+ " ");
				i-- ;
			}

		}else if(opt == 2){

			int gTotal = 1 ;
			int total = 0 ;
			rem = 0; 
			int cnt = 0 ;
			while (no > 0){
				rem = no % 10 ;
				no = no/10 ;
			if(rem == 1){
				if (cnt == 0){
					total = 1 ;
				}else{
					for(int i = cnt; i > 0  ; i--){
						gTotal = gTotal * 2 ;
					}
					total = total + gTotal ;
					gTotal = 1 ;	
				}
				cnt++ ;
			}else{
				cnt++ ;
			}
			}
			
			
				cn.printf(total+ " ");	
			
		}	

	}
}