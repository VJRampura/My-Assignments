class UseRationalConstructors {
	public static void main(String args[]){
		RationalConstructors rt = new RationalConstructors() ;
		System.out.println("Default Constructor Rational values are :");
		rt.show() ;

		RationalConstructors rt1 = new RationalConstructors(1,4) ;
		System.out.print("Default Constructor Rational values are :");
		rt1.show() ;
		System.out.println();

		RationalConstructors rt2 = new RationalConstructors(rt1) ;
		System.out.print("Default Constructor Rational values are :");
		rt2.show() ;
		
		
	}
}