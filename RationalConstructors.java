class RationalConstructors {
	private int numerator ;
	private int denominator ;

	//Default Constructor...

	public RationalConstructors() {
	
	}
	
	//Parameterized Constructor...

	public RationalConstructors(int num, int deno){
		this.numerator = num ;
		this.denominator = deno ;
	}

	//Copy Constructor...

	public RationalConstructors(RationalConstructors r){
		numerator = r.numerator ;
		denominator = r.denominator ;
	}


	//read method....

	public void read(int num, int deno){
		numerator = num ;
		denominator = deno ;
	}


	//show method...
	public void show(){
		System.out.print(numerator+"/"+denominator) ;

	}

}