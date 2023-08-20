import java.io.* ;
class RationalNumbers{
	public static void main(String args[]){
		Rational sat = new Rational() ;
		Console cn = System.console() ;
		cn.printf("Enter Numerator And Denominator : \n") ;
		int a = Integer.parseInt(cn.readLine()) ;
		int b = Integer.parseInt(cn.readLine()) ;
		sat.set(a,b) ;
		cn.printf("The Rational Number Is : \n") ;
		sat.show() ;

	}
}