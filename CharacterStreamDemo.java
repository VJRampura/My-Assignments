import java.io.*;
import java.util.*;
class CharacterStreamDemo{
	public static void main(String args[])throws IOException{
		Console cn = System.console();
		
	// 1. StringWriter() And StringReader().................... 	
		
		/*System.out.println("Enter your String : ");
		String s1 = cn.readLine();
		StringWriter sw = new StringWriter();
		sw.write(s1);
		String s = sw+"";
		System.out.println(s);
		StringReader sr = new StringReader(s1);
		StringBuffer sf = new StringBuffer();
		System.out.println("your New Result : ");
		int ch ;
		while((ch = sr.read()) != -1)
			sf.append((char)ch);
		System.out.println(sf);*/
		
		
	// 2. Reading/Writing into a File Using StringReader/StringWriter.....

		/*System.out.println("Enter your File Name : ");
		String s2 = cn.readLine();
		FileReader fr = new FileReader(s2);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("bb.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int  ch ;
		StringBuffer sf = new StringBuffer();
		while((ch = br.read()) != -1)
			bw.write((char)ch);*/
		
			
	// 3. Buffered with sequence Reading........	
		/*FileInputStream f1 = new FileInputStream("a.txt");
		FileInputStream f2 = new FileInputStream("b.txt");
		SequenceInputStream s1 = new SequenceInputStream(f1,f2);
		BufferedInputStream b1 = new BufferedInputStream(s1);
		FileOutputStream fo = new FileOutputStream("aaa.txt");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		int  ch ;
		while((ch = b1.read()) != -1)
			bo.write(ch);
		b1.close();
		bo.close();*/
		char a = -2;
		System.out.println(a);
		
		
		
		
		
	}
}