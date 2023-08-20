import java.util.*;
import java.io.*;
class UseMyStack{
	public static void main(String args[]){
		MyStack s = new MyStack();
		Console cn = System.console();
		String name ;
		System.out.println("Enter 10 names : ");
		for(int i = 1 ;i <= 10;i++){
			name = cn.readLine();
			s.push(name);
		}
		System.out.println("Name in Reverse Order : ");
		while(!s.empty()){
			name = (String)s.pop();
			System.out.println(name);
		}
		
	}
}