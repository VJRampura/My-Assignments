package TwoFilesContentsCopyClass ;
import java.io.* ;
public class TwoFilesContentsCopy{
	public static void main(String args[]) throws IOException{
		if(args.length != 3 ){
			System.out.println("Invalid Arguments....");
			System.exit(0);
		}
		File f1 = new File(args[0]) ;
		File f2 = new File(args[1]) ;
		if(!f1.exists())
			f1.createNewFile();
		if(!f2.exists())
			f2.createNewFile();
		FileInputStream fis1 = new FileInputStream(args[0]) ;
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		FileInputStream fis2 = new FileInputStream(args[1]) ;
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		FileOutputStream fos = new FileOutputStream(args[2],true);
		
		/* -if we are not using any argument at the 2nd position of fileoutputstream object then
			   if  the file is not available, it will create a new file and write the data into it, otherwise it will
		           write the data by removing all previous data into the file.
		   -if we use 'True' keyword then it will append the data if the file is exist already in the current directory/ specified destination
				otherwise create a new file and write the data into it.
		   -if we use 'False' keyword then it wil work same as no arguments condition...	*/	
		
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch ; 
		while((ch=fis1.read())!= -1)
			bos.write(ch);
			bos.write(28);
		System.out.println("File One Reading Completed");
		while((ch=fis2.read())!= -1)
			bos.write(ch);
		System.out.println("File Two Reading Completed");
		
		bis1.close();
		bis2.close();
		bos.close();
		
	}
}