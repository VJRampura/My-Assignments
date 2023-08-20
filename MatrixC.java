import java.io.* ;
class MatrixC {
	private int arr[][]  ;	


	//default Constructor.......
	
	public MatrixC(){
		arr = new int[3][3] ;	
	}


	//Parameterized Constructor.......

	public MatrixC(int a,int b){
		arr = new int[a][b] ;
		
	} 


	//Copy Constructor.......

	public MatrixC(MatrixC m){
		arr = new int[m.arr.length][m.arr[0].length] ;	
	}

	


	//Add Method For Two Matrix Addition.......	

	public MatrixC add(MatrixC m){
		MatrixC arr1 = new MatrixC(m.arr.length,m.arr[0].length) ;
		
		for (int i = 0 ; i < m.arr.length; i++)
			for (int j = 0 ; j < m.arr[i].length; j++)
			arr1.arr[i][j] = arr[i][j] + m.arr[i][j] ;
		return arr1;
		
			
	}



	//Less Method For Two Matrix Subtraction.......	

	public MatrixC less(MatrixC m){
		MatrixC arr1 = new MatrixC(m.arr.length,m.arr[0].length) ;
		
		for (int i = 0 ; i < m.arr.length; i++)
			for (int j = 0 ; j < m.arr[i].length; j++)
			arr1.arr[i][j] = arr[i][j] - m.arr[i][j] ;
		return arr1;
		
	}



	//Multiply Method For Two Matrix Multiplication.......	

	public MatrixC multiply(MatrixC m){
		MatrixC arr1 = new MatrixC(m.arr.length,m.arr[0].length) ;
		
		for (int i = 0 ; i < m.arr.length; i++)
			for (int j = 0 ; j < m.arr[i].length; j++)
			arr1.arr[i][j] = arr[i][j] * m.arr[i][j] ;
		return arr1;
	}


	//Transpose Method For Two Matrix Transposition.......	

	public MatrixC divide(MatrixC m){
		MatrixC arr1 = new MatrixC(m.arr.length,m.arr[0].length) ;
		
		for (int i = 0 ; i < m.arr.length; i++)
			for (int j = 0 ; j < m.arr[i].length; j++)
			arr1.arr[i][j] = arr[i][j] / m.arr[i][j] ;
		return arr1;
	}

	public void read(){
		int i, j ;	
		Console cn = System.console();
		for (i = 0 ; i < arr.length; i++)
			for (j = 0 ; j < arr[i].length; j++)
				arr[i][j] = Integer.parseInt(cn.readLine()) ;
	}	


	public void show(){
		int i, j ;
		for (i = 0 ; i < arr.length; i++){
			for (j = 0 ; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ") ;
				System.out.println() ;
		}



	}

	

}