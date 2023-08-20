import java.io.*; import java.util.*;
	class PostfixEvaluation{
		public static void main(String args[]){
			Console cn = System.console();
			Stack s1 = new Stack();
    	    System.out.print("Enter Postfix Expression : ");     
			String str = cn.readLine();                 
    	   	char []arr = str.toCharArray(); 
			int no,a,b  ;
			for(int i = 0 ; i < arr.length ; i++){
					
					if((arr[i] == 43 | arr[i] == '-' |arr[i] == '*' | arr[i] == '/') && !s1.empty()){
						 b = (int)s1.pop();
						 a = (int)s1.pop();
						
						if(arr[i] == '+'){
							s1.push(a+b);
						}else if(arr[i] == '+'){
							s1.push(a-b);
						}else if(arr[i] == '*'){
							s1.push(a*b);
						}else if(arr[i] == '/'){
							s1.push(a/b);
						}	
					}else{ 		
						no = Character.getNumericValue(arr[i]);
						if(no >= 0 && no <= 9 ){
							s1.push(no);	
						}
					}	
			}
			System.out.println(s1.peek());
		}      				
	}	 