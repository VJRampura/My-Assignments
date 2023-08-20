/*import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
       Console cn = System.console();
       String st = cn.readLine();
	   //int n = Integer.parseInt(cn.readLine());
       st.trim();
       int a = 0,b = 0 ;
       char string[] = new char[15];
       char arr[] = st.toCharArray();
	   char nm[] = new char[]{'0','0','0'}; 
       for(int i = 0 ; i < arr.length;i++){
			 if (b >= 3){
			 break;  
		  }	
		 if(Character.isAlphabetic(arr[i])){
              string[a] = arr[i];
              a++ ;   
          } else if ((!Character.isAlphabetic(arr[i])) && !Character.isWhitespace(arr[i])) {
             nm[b] = arr[i] ;
             b++ ; 
          } 
		 	
       } 
	   
       st = String.copyValueOf(string) ;
       cn.printf(st);
       cn.printf(nm[0]+""+nm[1]+""+nm[2]);
	   
       
        
         
    }
}*/



import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true ;
        int i = 1 ;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(i +" "+ line);
            i++;
        }
        sc.close();
    }
}








/*
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String s ;
                //Complete this line
                int j = s1.length();
                for( int a = j ; a <= 14; a++)
                    s1 += " " ;
                if(x < 10)
                     s = "00"+ x ;
                else if(x < 100)
                    s = "0"+ x ; 
                else 
                    s = ""+ x ;             
                System.out.println( s1 + s) ;  
            }
            System.out.println("================================");

    }
}


*/
