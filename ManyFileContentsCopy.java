 package fin;
// if we create a package for main method program then we have to run that program like..
//	"java fin.ManyFileContentsCopy a.txt b.txt c.txt" 
import java.io.* ;
public class ManyFileContentsCopy{
	public static void main(String args[]) throws IOException{
		if(args.length <= 1 ){
			System.out.println("Invalid Arguments....");
			System.exit(0);
		}
		for(int i = 0 ; i < args.length-1; i++){
			File f1 = new File(args[i]) ;
			if (!f1.exists()){
				System.out.println("File Not Found, Coping Data Is Terminated");
				System.exit(0);
			}
			
			FileInputStream fis = new FileInputStream(args[i]) ;
			BufferedInputStream bis = new BufferedInputStream(fis);
		
			FileOutputStream fos = new FileOutputStream(args[args.length-1],true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int ch ; 
			while((ch=bis.read())!= -1)
				bos.write(ch);
				bos.write(28);
			
			System.out.println("File Reading Completed");
			bis.close();
			bos.close();
		}
		
	}
}