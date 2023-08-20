import java.io.*;
import java.util.*;
import java.util.regex.*;

public class StringSpilter  {

    public static void main(String[] args) throws IOException {
        Console cn = System.console();
        String s = cn.readLine();
        String pattern = "[//w //d]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        if(!m.find()){
            System.out.println("Invalid Input");
            System.exit(0);
        }   
           
		while(m.find())
                System.out.println(m.group(0)+ "\n");    

		   /*StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
                System.out.println(st.nextToken()); */   
    }
}