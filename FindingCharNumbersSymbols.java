import java.io.* ;
class FindingCharNumbersSymbols {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Enter Character value : \n");
		String str = cn.readLine();
		char ch = str.charAt(0) ;
		cn.printf("ASCII Value Of Input Is :" + Integer.valueOf(ch)+ " \n");
		if(((ch <= 90)&(ch >= 65))|((ch >= 97)&(ch <= 122)))
			cn.printf("This Is A Character Value");
		else if(ch == 32 | ch == 13)
			cn.printf("This Is Either A Space Value Or A Null Value");
		else if(ch >= 48 & ch <= 57)
			cn.printf("This Is A Numeric Value");
		else
			cn.printf("This Is A Symbolic Value");

	}
}