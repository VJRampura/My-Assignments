import java.io.* ;
import java.util.* ;
class HoldData{
	private Vector v = new Vector();
	private boolean hold = true;
	String fSet ;
	
	
	synchronized public void setData(String f){
		while(!hold){
			try{
				
				System.out.println("1");
				wait();
			
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		try{
			FileInputStream f1 = new FileInputStream(f);
			BufferedInputStream b1 = new BufferedInputStream(f1);
			int ch ;
			while((ch = f1.read()) != -1)
				v.add(ch);
			fSet = f ;
			hold = false;
			notify();
			b1.close();
		}
		catch(IOException e){
				System.out.println(e.getMessage());
			
		}
	}
	
	synchronized public String getData(String s) {
		while(hold){
			try{
				System.out.println("2");
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		try{
			notify();
			hold = true;
			fSet = s + "/"+ fSet.replace(".","1.");
			FileOutputStream f2 = new FileOutputStream(fSet);
			int ch ;
			for( int i = 0;i < v.size();i++){				
				ch = (int)v.get(i);
				f2.write(ch);
			}	
			v.clear();
			f2.close();
		}
		catch(IOException e){
				System.out.println(e.getMessage());
			
		}
			return fSet ;
	}
	
}


class FileReader extends Thread {
	private HoldData rHold;
	private String s1 ;
	public FileReader(HoldData h, String s){
		rHold = h ;
		s1 = s ;
	}
	
	public void run(){
			
				rHold.setData(s1);
				System.out.println("File '"+ s1+"' Read." );	
		
	}
}


class FileWriter extends Thread {
	private HoldData wHold ;
	private String st ;
	public FileWriter(HoldData h,String ss){
		wHold = h ;
		st = ss ;
	}
	public void run(){
	String s = wHold.getData(st);
	System.out.println("File Copied Successfully." );
		
	}
	
}

public class FileCopyCreator{
	public static void main(String args[]){
		
		Console cn = System.console();
		System.out.println("Enter File Directory :");
		String str = cn.readLine();
		System.out.println("Enter File Directory :");
		HoldData h = new HoldData();
		File f1 = new File(str);
		String arr[] ;
		if(f1.exists()){
			arr = f1.list();
			System.out.println("Files Found To Copy.");
			for(String s2 : arr){
				File ff = new File(s2);
				if(ff.isFile()){
					FileReader r = new FileReader(h,s2);
					FileWriter w = new FileWriter(h,str);
					r.start();
					System.out.println("3");
					
					w.start();
				}
			}
				
		}
		else{
			System.out.println("No Files Found To Copy.");
			arr = null ;
			System.exit(0);
		}

		
	}
}