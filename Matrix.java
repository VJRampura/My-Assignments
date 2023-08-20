 import java.io.* ;
class Matrix{
	private int arr[][] ;

	//default Constructor....

	public Matrix() {
		arr = new int[3][3] ;
	}


	//Parameterized Constructor....

	public Matrix(int a, int b) {
		arr = new int[a][b] ;
		
	}

	//Copy Constructor....


	public Matrix(Matrix m){
		arr =  new int[m.arr.length][m.arr[0].length] ;
		
	}
	
	public void read() 
	{
		Console con = System.console();
		int i, j ;
		for(i=0; i < arr.length; i++)
			for(j=0;j<arr[i].length;j++)
				arr[i][j] = Integer.parseInt(con.readLine()) ;
	}

	public void show()
	{
		int i, j ;
		for(i=0; i < arr.length; i++) {
			for(j=0;j<arr[i].length;j++)
				System.out.print( arr[i][j] +" ");
			System.out.println() ;
		}
	}
}