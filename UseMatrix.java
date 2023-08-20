import java.io.* ;
class UseMatrix
{
	public static void main(String args[])
	{
	//default constructor....
		System.out.println("Default Matrix Is : ") ;
		Matrix m1 = new Matrix() ;
		m1.show() ;
			

	//Parameterized constructor....
		Matrix m2 = new Matrix(5,4) ;
		System.out.println("Enter Rows,Columns Values for Parameterized Constructer : ");
		m2.read() ;
		System.out.println("Second Matrix Is : ") ;
		m2.show() ;

	//Copy constructor....
		Matrix m3 = new Matrix(m2) ;
		System.out.println("Enter Rows,and Columns Values for Copy Constructer : ");
		m3.read() ;
		System.out.println("Copy Matrix Is : ") ;
		m3.show() ;


		

		

	
	}
}


