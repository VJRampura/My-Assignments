import java.io.* ;
import java.util.* ;
class HoldData{
	private Vector v = new Vector();
	private boolean hold = true;
	String fSet ;
	
	
	synchronized public void setData(String f){
		while(!hold){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		try{
			FileInputStream f1 = new FileInputStream(f);
			DataInputStream d1 = new DataInputStream(f1);
			String ch ;
			while((ch = d1.readLine()) != null)
				v.add(Integer.parseInt(ch));
			fSet = f ;
			hold = false;
			notify();
			d1.close();
		}
		catch(IOException e){
				System.out.println(e.getMessage());
			
		}
	}
	
	synchronized public String getData(String s) {
		while(hold){
			try{
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
			DataOutputStream d2 = new DataOutputStream(f2);
			String ch ;
			int j = 0 ;
			for( int i = 0;i < v.size();i++){	
				Integer k = (int)v.get(i);
			
				j +=  k ;
				
			}	
				System.out.println(j);
				ch = j + "";
				char ch1;
				for(int q = 0;q< ch.length();q++){
					ch1 = ch.charAt(q);
				f2.write(ch1);
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
				System.out.println("File "+ s1+"'s Data Read." );	
		
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
	System.out.println("File Data Addition Successfully Completed." );
		
	}
	
}




public class FileDataSum{
	public static void main(String args[]){
			System.out.println("Enter File Directory :");
		
		Console cn = System.console();
		String str = cn.readLine();
		HoldData h = new HoldData();
		File f1 = new File(str);
		String arr[] ;
		if(f1.exists()){
			 arr = f1.list();
			System.out.println("Files Found To Sum.");
			for(String s2 : arr){
				if(s2.endsWith(".txt")){
					FileReader r = new FileReader(h,s2);
					FileWriter w = new FileWriter(h,str);
					r.start();
					w.start();
				}
			}
				
		}
		else{
			System.out.println("No Files Found To Addition.");
			arr = null ;
			System.exit(0);
		}

		
	}
}