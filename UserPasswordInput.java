import java.io.* ;
class UserPasswordInput{
	public static void main(String args[]){
		Console con = System.console();
		con.printf("Enter Your Password :");
		String pwd = " " ;
		pwd = pwd.copyValueOf(con.readPassword());
		if(pwd.equals("Jai"))
		con.printf("\n Welcome Shri RamJi");
		else
		con.printf("\n Invalid Password");
		
	}
}