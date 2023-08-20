import java.io.* ;
class RenameToMethod{
	public static void main(String args[]) throws IOException {
		File f1 = new File("dddd.txt");
		File f2 = new File("a.txt");
		
			if(!f1.exists())
				f1.createNewFile();
			boolean a = f1.renameTo(f2);
			if(true)
				System.out.print("Success");
			else
				System.out.print("Fail");
				
	}
}