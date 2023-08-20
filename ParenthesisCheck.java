import java.io.*; import java.util.*;
class ParenthesisCheck{
	public static void main(String args[]){
		Console cn = System.console();
		Stack s1 = new Stack();
		System.out.print("Enter Expression Value : ");
		String str = cn.readLine();
		char []arr = str.toCharArray();
		int i = 0 ;
		while(i < arr.length){
			
			if(arr[i] == '('){
				s1.push(arr[i]);
			}else if (arr[i] == ')' && s1.empty()){
				System.out.println("Left Parenthesis is Missing.");
				break ;
			}else if (arr[i] == ')' && !s1.empty()){
				s1.pop();
			}	
			 if(i == arr.length-1 && s1.empty()){
				System.out.println("Valid.");
			}
			else if (i == arr.length-1 && !s1.empty()){
				System.out.println("Right Parenthesis is Missing.");
			}	
			i++;
		}			
	}
}