import java.io.* ;
class RemoveExtraSpeces {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Enter Sentence : \n");
		String str = cn.readLine();
		String newStr = "" ;
		str = str.trim() ;
		int pos = 0, lPos, i=0;
		lPos = str.lastIndexOf(" ") ;
		while(pos < lPos+1){
			pos = str.indexOf(" ",pos) ;
			newStr = newStr + str.substring(i,pos);
			while(str.charAt(pos+1) == ' ')
				pos++ ;
			i = pos;
			pos++;
		}
		pos = str.length() ;
		newStr = newStr + str.substring(i,pos);
		cn.printf(newStr);
		
	}

}