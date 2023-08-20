class AddMoney{
	private int rs,p;
	public AddMoney(){

	}

	public AddMoney(int a, int b){
		rs = a ;
		p = b ;
	}

	public AddMoney(AddMoney a){
		rs = a.rs ;
		p = a.p ;
	}

	public AddMoney add(AddMoney m, AddMoney m1){
		AddMoney am = new AddMoney() ;
		am.rs = rs + m.rs + m1.rs ;
		am.p = p + m.p + m1.p ;
		return am ;
	}

	public void read(int a, int b){
		rs = a ;
		p = b ;
	}

	public void show(){
		System.out.println("rs = " + rs +"."+p);
	}




}