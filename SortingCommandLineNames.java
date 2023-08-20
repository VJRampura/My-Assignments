import java.io.*;
class SortingCommandLineNames {
	public static void main(String args[]){
		Console cn = System.console();
		String str = null ;
		int i, j;
		for(i= 0 ; i < args.length-1; i++){

			for(j = i+1 ; j < args.length; j++){

				if(args[j].compareTo(args[i]) < 0){
					str = args[j] ;
					args[j] = args[i] ;
					args[i] = str ;
				}
			}
		}
			
			for(i = 0 ; i < args.length; i++)
				cn.printf(args[i]+ " ");
			
	}
}