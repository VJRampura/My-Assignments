class ThisMethodForConstructor {
	private int x,y,z ;

	//Parameterized...
	public ThisMethodForConstructor(int a, int b, int c){
		x = a ;
		y = b ;
		z = c ;

	}

	//Parameterized...
	public ThisMethodForConstructor(int a, int b){
		this(a,b,0);
	}

	//Parameterized...
	public ThisMethodForConstructor(int a){
		this(a,0,0);
	}

	//Default...
	public ThisMethodForConstructor(){
		this(0,0,0);
	}

	//copy....
	public ThisMethodForConstructor(ThisMethodForConstructor p){
		this(p.x,p.y,p.z);
	}
	
	public void show(){
		System.out.println("x = " + x +" y = " + y+ " z = " + z);
	}

}