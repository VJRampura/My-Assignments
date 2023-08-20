class One{
	int x ;
	public void set(int a){
		x = a ;
	}
	
	public void show(){
		System.out.print("x = "+ x);
	}


}

class Two extends One{
	int x ;
	public void set(int a, int b){
		super.x = a ;
		x = b ;
	}
	
	public void show(){
		super.show();
		System.out.print("x = "+ x);
	}


}