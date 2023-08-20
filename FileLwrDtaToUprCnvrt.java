package FileLwrDtaToUprCnvrt ;
import java.io.*;
class FileLwrDtaToUprCnvrt{
	public static void main(String args[]) throws IOException{
		if(args.length < 1){
			System.out.println("No Arguments Passed") ;
			System.exit(0);
		} else if (args.length > 2){
			System.out.println("More Then 1 Arguments Not Allowed") ;
			System.exit(0);
		} 
		
		FileInputStream fis1 = new FileInputStream(args[0]) ;
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		
		File file  = new File("temp.txt");
		if(!file.exists())
			file.createNewFile();
		FileOutputStream fos = new FileOutputStream("temp.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int ch ; 
		while((ch=fis1.read())!= -1){
				ch = (int)(Character.toUpperCase((char)ch));
				bos.write(ch);
		}
		
		
			//System.out.println("not successful");
		
		bis1.close();
		bos.close();
		
		File f1 = new File(args[0]);
		f1.delete();
		File f2 = new File(args[0]);
		File f3 = new File("temp.txt");
		
		f3.renameTo(f2);
	}
}