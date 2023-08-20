package FileDataAlphabeticRemoveClass ;
import java.io.* ;
public class FileDataAlphabeticRemove{
	public static void main(String args[]) throws IOException{
		if(args.length != 1  ){
			System.out.println("Invalid Arguments....");
			System.exit(0);
		}
		FileInputStream f1 = new FileInputStream(args[0]);
		File file  = new File("temp.txt");
		if(!file.exists())
			file.createNewFile();
		FileOutputStream fos = new FileOutputStream("temp.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int ch,i = 0 ;
		
		while((ch=f1.read())!= -1){
			if(!(Character.isAlphabetic((char)ch)) )
				bos.write(ch);
		}
		f1.close();
		bos.close();
		
		File f = new File(args[0]);
		f.delete();
		File f2 = new File(args[0]);
		File f3 = new File("temp.txt");
		
		f3.renameTo(f2);
	}
}