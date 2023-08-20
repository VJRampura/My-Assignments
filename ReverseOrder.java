import java.io.*;
import java.util.*;
class ReverseOrder{
	public static void main(String args[]) {
		Console cn = System.console();
		Stack s = new Stack();
		int i = 1 ;
		String name;
		System.out.println("Enter 10 Names : ");
		
			while(i <= 10){
				name = cn.readLine();
				s.push(name);
				i++;
			}
			
			System.out.println("Your Names in Reverse Order Are : ");
			int n = s.search("a");
			i = 1 ;
			while(i <= a ){
				String name1 = (String)s.peek();
				//name = (String)s.pop();
				//System.out.println(name);
				System.out.println(name1);
				
			
			}
	}
}