import java.io.* ;
class RationalOperations {
	public static void main(String args[]){
		Rational s1 = new Rational(10,20) ;
		Rational s2 = new Rational(30,40) ;

		System.out.print("First Numerator And Denominator is: ") ;
		s1.show() ;
		System.out.print("Second Numerator And Denominator is: ") ;
		s2.show() ;
		Rational s3,s4,s5,s6 ;

		s3 = s1.add(s2);
		System.out.print("Sum Numerator And Denominator is: ") ;
		s3.show() ;
		
		s4 = s1.less(s2);
		System.out.print("less Numerator And Denominator is: ") ;
		s4.show() ;
		
		s5 = s1.multiply(s2);
		System.out.print("Multiply of Numerator And Denominator is: ") ;
		s5.show() ;

		s6 = s1.divide(s2);
		System.out.print("division of Numerator And Denominator is: ") ;
		s6.show() ;

	}
}