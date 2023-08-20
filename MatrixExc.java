import java.io.*;
class InvalidConstructorException extends Exception{
	public InvalidConstructorException(String st){
		super(st);
	}
}


class MatrixExc{
	
	private int arr[][] ;
	
	public MatrixExc(int a , int b) throws InvalidConstructorException {
		if (a > 0 && b > 0){
		arr = new int[a][b] ;
		}else{
			throw new InvalidConstructorException("Invalid Constructor.");
		}
	}
	
	public void read(){
		Console cn = System.console();
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				arr[i][j] = Integer.parseInt(cn.readLine()) ;
			}
		}
	}
	
	public void show(){
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]) ;
			}
			System.out.println(); 	
		}
	}
	
	
}