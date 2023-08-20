class Rational {
	private int numerator ;
	private int denominator ;

	//Default Constructor....

	public Rational(){
		
	}

	//Parameterized Constructor....
		
	public Rational(int a, int b){
		this.numerator = a ;
		this.denominator = b ;
		
	}

	//Copy Constructor......
	
	public Rational(Rational r){
		this.numerator = r.numerator ;
		this.denominator = r.denominator ;
		
	}

	public void set(int n, int d) {
		numerator = n ;
		denominator = d ;
	}

	public void show() {

		System.out.println(numerator + "/" + denominator);
	}



	//Add Two Rational Values....
 
	public Rational add(Rational r){
		Rational temp = new Rational() ;
		temp.numerator = (numerator*r.denominator) + (r.numerator*denominator);
		temp.denominator = denominator * r.denominator ;
		return temp ;
	}

	
	//Less Two Rational Values ....
	
	public Rational less(Rational r){
		Rational temp = new Rational() ;
		temp.numerator = (numerator*r.denominator) - (r.numerator*denominator);
		temp.denominator = denominator * r.denominator ;
		return temp ;
	}


	//Multiple Two Rational Values ....
	
	public Rational multiply(Rational r){
		Rational temp = new Rational() ;
		temp.numerator = numerator * r.numerator;
		temp.denominator = denominator * r.denominator ;
		return temp ;
	}

	
	//Divide Two Rational Values ....
	
	public Rational divide(Rational r){
		Rational temp = new Rational() ;
		temp.numerator = numerator *  r.denominator ;
		temp.denominator = r.numerator *denominator ;
		return temp ;
	}

}