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

			int gTotal = 0 ;
			int total = 0 ;
			int a = 0 ;
			String num = no ;
			for(int i = 0; i < num.length() ; i++){
				a = (int)(num.charAt(i)) ;
				for(int j = num.length() ; j > 1 ; j--) 
					 gTotal = gTotal + a * 2 ;
				total = total + gTotal ;
			}
				
			
		}	

	}
}