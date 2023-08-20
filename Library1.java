import java.io.* ;
class Library1 {
	public static void main(String args[]){
		
		Console con = System.console();
		Item tm ;
		char ar[] = new char[10] ;
		for(int i = 0 ;i < 3 ; i++){
			con.printf("Book Or Dvd <B/D> : ");
			String s1 = con.readLine();
			ar[i] = s1.charAt(0);
			if(ar[i] == 'b'){
				tm = new Book();
				tm.read();
			}else if(ar[i] == 'd'){
				tm = new Dvd();
				tm.read();
			}
			
		}
		con.printf("\nList of Issued Items Is : \n\n");
		for(int i = 0 ;i < 3 ; i++){
			if(ar[i] == 'b'){
				tm = new Book() ;
				tm.show() ;
			}else {	
				tm = new Dvd() ;
				tm.show() ;
			}
		}
	}
}