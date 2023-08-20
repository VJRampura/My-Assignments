import java.util.Scanner;
import java.util.* ;

public class AnagramCheck {
	
    static boolean isAnagram(String a, String b) {
		boolean status = false ;
       char x[] = a.toLowerCase().toCharArray();
       char y[] = b.toLowerCase().toCharArray();
	   Arrays.sort(x);
	   Arrays.sort(y);
	   String q = String.copyValueOf(x);
	   String w = String.copyValueOf(y);
        if(q.compareTo(w) == 0)
			status = true ;
		return status ;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
