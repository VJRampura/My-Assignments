import java.io.* ;
class PallinDromStringCheck {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Enter Sentence: \n");
		String str = cn.readLine() ;
		int i, j, cnt = 0 ;
		str = str.trim() ;

		for(i = 0, j = str.length()-1; i<= j;i++,j--)
			if(str.charAt(i) == str.charAt(j))
				cnt++ ;
			else 
				i = j ;
			if(cnt >= j)
				cn.printf("Yes! This Is Pallindrom");
			else
				cn.printf("\n No! Not A PallinDrom");

	}

}