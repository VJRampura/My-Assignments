class UseRationalExc{
	public static void main(String args[]) throws InvalidDenominatorException{
		RationalExc re = null ;
		RationalExc re1 = null ;
		RationalExc re2 = null ;
		
		
		try{
			re = new RationalExc(100,2);
			re1 = new RationalExc(50,-2);
			re2 = re.add(re1);
			re2.show();
			
		}
		catch(InvalidDenominatorException e1){
			System.out.println(e1.getMessage());
		}
		//re.show();
		
		
		try{
			re = new RationalExc();
			re.set(100,0);
			re1.set(100,5);
			re2 = re.add(re1);
			re2.show();
		}
		catch(InvalidDenominatorException e2){
			System.out.println(e2.getMessage());
		}
		//re.show();
		re2 = new RationalExc();
		re2.set1(100,0);
		
		System.out.println("this is ending of my program");
	}
	
}