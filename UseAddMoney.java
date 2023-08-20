class UseAddMoney {
	public static void main(String args[]){
		AddMoney a1 = new AddMoney();
		a1.show() ;

		AddMoney a2 = new AddMoney(40,20);
		a2.show() ;

		AddMoney a3 = new AddMoney(40,40);
		a3.show() ;

		AddMoney a4 = new AddMoney(20,40);
		a4.show() ;

		AddMoney a5 = a2.add(a3,a4);
		a5.show() ;
		

	} 

}