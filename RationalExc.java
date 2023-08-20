class InvalidDenominatorException extends Exception{
	public InvalidDenominatorException(String s){
		super(s);
	}
}


class RationalExc{
	private int numerator = 0 ;
	private int denominator = 0 ;

	public RationalExc(){}
	
	
	public RationalExc(int n, int d) throws InvalidDenominatorException{
		if(d != 0){
			this.numerator = n ;
			this.denominator = d ;
		} else {
			throw new InvalidDenominatorException("Denominator Should Not Be Zero.");
		}
	}
	
	
	public void set(int n, int d) throws InvalidDenominatorException{
		if(d != 0){
			this.numerator = n ;
			this.denominator = d ;
		} else {
			throw new InvalidDenominatorException("Denominator Should Not Be Zero.");
		}
	}
	public void set1(int n, int d) throws ArithmeticException{
		try{
			this.numerator = n ;
			this.denominator = d ;
			int a = numerator/denominator ;
		} catch(ArithmeticException d1) {
			System.out.println(d1.getMessage());
		}
	}
	
	
	public void show(){
		System.out.println("The Value Is :" + numerator+ "/"+ denominator);
	}
	
	
	public RationalExc add(RationalExc r) {
		RationalExc temp = new RationalExc();
		numerator = (this.numerator * r.denominator )+(this.denominator * r.numerator);
		denominator = this.denominator * r.denominator ;
		temp.numerator = numerator ;
		temp.denominator = denominator ;
		return temp ;
	}
	
	
	public RationalExc less(RationalExc r) {
		RationalExc temp = new RationalExc();
		numerator = (this.numerator * r.denominator )-(this.denominator * r.numerator);
		denominator = this.denominator * r.denominator ;
		temp.numerator = numerator ;
		temp.denominator = denominator ;
		return temp ;
	}
	
	
	public RationalExc multiply(RationalExc r) {
		RationalExc temp = new RationalExc();
		numerator = this.numerator * r.numerator;
		denominator = this.denominator * r.denominator ;
		temp.numerator = numerator ;
		temp.denominator = denominator ;
		return temp ;
	}
	
	
	public RationalExc devide(RationalExc r) {
		RationalExc temp = new RationalExc();
		numerator = this.numerator * r.denominator;
		denominator = this.denominator * r.numerator ;
		temp.numerator = numerator ;
		temp.denominator = denominator ;
		return temp ;
	}
	
}