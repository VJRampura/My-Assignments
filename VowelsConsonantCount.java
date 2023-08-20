import java.io.*;
class VowelsConsonantCount {
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Type Your Sentence : \n");
		String str = cn.readLine();
		int i, vovel = 0 , conso = 0;
		char j = ' ' ;
		for(i = 0;i < str.length(); i++){
			j = str.charAt(i);	
		switch(j){
			case 'a' :
			vovel++;
			break;
			case 'e' :
			vovel++;
			break;
			case 'i' :
			vovel++;
			break;
			case 'o' :
			vovel++;
			break;
			case 'u' :
			vovel++;
			break;
			case 'A' :
			vovel++;
			break;
			case 'E' :
			vovel++;
			break;
			case 'I' :
			vovel++;
			break;
			case 'O' :
			vovel++;
			break;
			case 'U' :
			vovel++;
			break;
			case ' ' :
			break;
			default :
			conso++ ;
		}
		}
		cn.printf("Total Vowels Are : "+ vovel + "\n");
		cn.printf("Total Consonants Are : "+ conso);
	}
}