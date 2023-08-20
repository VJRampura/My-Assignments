import java.io.* ;
class NumberOfWords {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Enter Your Sentence: \n\n");
		String str = cn.readLine();
		str = str.trim() ;
		int pos= 0, lPos = 0, len, no, cnt = 1 ;
		len = str.length();
		lPos = str.lastIndexOf(" ") ;
		while(pos <= lPos){
			pos = str.indexOf(" ",pos) ;
			 if(str.charAt(pos+1) != ' '){
					cnt++ ;
					pos++;
				}else{
					pos++ ;
				}
				
		}
		cn.printf("Total Words In This Sentence Is :  " + cnt);
	}


}