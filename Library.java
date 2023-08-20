import java.io.* ;
class Library {
	public static void main(String args[]){
		
		Console con = System.console();
		Item ar[] = new Item[10] ;
		for(int i = 0 ;i < 3 ; i++){
			con.printf("Book Or Dvd <B/D> : ");
			String s1 = con.readLine();
			if(s1.equalsIgnoreCase("b")){
				ar[i] = new Book();
				
			}else {
				ar[i] = new Dvd();
			}	
				ar[i].read();
			
			
		}
		con.printf("\nList of Issued Items Is : \n\n");
		for(int i = 0 ;i < 3 ; i++){
				ar[i].show() ;
			}

	}
}