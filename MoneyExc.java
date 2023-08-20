class InvalidAmountException extends Exception{
	public InvalidAmountException(String str){
	super(str);
	}
}
class MoneyExc{
	private int rs ;
	private int paisa ;
	
	public MoneyExc(){
		
	}
	
	public MoneyExc(int r, int p) throws InvalidAmountException {
		if(r >= 0 && p >= 0){
		this.rs = r ;
		this.paisa = p ;
		} else {
			InvalidAmountException e = new InvalidAmountException("Amount Should Not Be Negative.");
			throw e ;
	}
	}
	public void set(int a, int b) throws InvalidAmountException {
		if(a >= 0 && b >= 0){
			rs = a ;
			paisa = b ;

		} else {
			
			throw new InvalidAmountException("Amount Should Not Be Negative.");
		}
	}
	public void show() throws InvalidAmountException{
		if(rs >= 0 && paisa >= 0){
		System.out.println("Rupees Are : "+ rs + " And Paisa is : "+ paisa );
	} 
	else {
			
			throw new InvalidAmountException("Amount Should Not Be Negative.");
		}
}
}