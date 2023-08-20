class UseMoneyExc{
	public static void main(String args[]) {
		MoneyExc m1 = null ;
		try{
			m1 = new MoneyExc(100,-10);
		}
		catch(InvalidAmountException e1){
			System.out.println(e1.getMessage());
		}
		try{
			m1 = new MoneyExc(100,-10);
		m1.show();
		}
		catch(InvalidAmountException e1){
			System.out.println(e1.getMessage());
		}
		
		
		
		//using Set method Exception ....
		
		try{
		m1.set(100,-20);
		}
		catch(InvalidAmountException e2) {
			System.out.println(e2.getMessage());
		}
		m1.show();
		
	}
}