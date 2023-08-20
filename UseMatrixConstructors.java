public class UseMatrixConstructors {
	public static void main(String args[]) {

	//Default Constructor call...
		MatrixC m1 = new MatrixC() ;
		System.out.println("Default is ");
		m1.show();



	//Parameterized Constructor call...
		MatrixC m2 = new MatrixC(3,4) ;
		System.out.println("Parameterized is ");
		m2.read();
		m2.show();

	//Copy Constructor call...
		MatrixC m3 = new MatrixC(m2) ;
		System.out.println("Copy is ");
		m3.read();
		m3.show();
		
	//Add Method Call For Two Matrix Addition.......	
		MatrixC m4 = m2.add(m3) ;
		System.out.println("Addition is ");
		m4.show() ;

	//Less Method Call For Two Matrix Addition.......	
		MatrixC m5 = m2.less(m3) ;
		System.out.println("Subtraction is ");
		m5.show() ;

	//Multiply Method Call For Two Matrix Addition.......	
		MatrixC m6 = m2.multiply(m3) ;
		System.out.println("Multiply is ");
		m6.show() ;

	//Divide Method Call For Two Matrix Addition.......	
		MatrixC m7 = m2.divide(m3) ;
		System.out.println("Division is ");
		m7.show() ;

	}

}