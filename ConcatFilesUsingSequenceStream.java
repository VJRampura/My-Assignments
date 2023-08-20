import java.io.* ;
class ConcatFilesUsingSequenceStream{
	public static void main(String args[]) throws IOException {
		FileInputStream f1 = new FileInputStream("a.txt");
		FileInputStream f2 = new FileInputStream("b.txt");
		//FileInputStream f3 = new FileInputStream("aa.txt");
		SequenceInputStream s1 = new SequenceInputStream(f1,f2);
		FileOutputStream fo = new FileOutputStream("c.txt");
		int ch ;
		while((ch = s1.read()) != -1)
			fo.write(ch) ;
		s1.close();
		fo.close();
	
	}
}