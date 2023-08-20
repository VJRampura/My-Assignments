class UseMatrix
{
	public static void main(String args[])
	{
		Matrix m1 = new Matrix() ;
		System.out.println("Enter 9 Values : ");
		m1.read() ;
		Matrix m2 = new Matrix() ;
		System.out.println("Enter 9 More Values : ");
		m2.read() ;
		System.out.println("First Matrix Is : ") ;
		m1.show() ;
		System.out.println("Second Matrix Is : ") ;
		m2.show() ;	
	}
}