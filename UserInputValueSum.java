import java.io.*;
class UserInputValueSum {
	public static void main(String args[]){
	Console con = System.console();
	int a, b, sum ;
		System.out.println("Enter Your 1st Value: ");
		a = Integer.parseInt(con.readLine());
		con.printf("Enter Your 2nd Value: \n");
		b = Integer.parseInt(con.readLine());
		sum = a+b ;
		con.printf("Your Values Sum Is: " + sum);
			//or
		con.printf("\n your sum is %d + %d = %d", a, b, a+b);
	
	}
}