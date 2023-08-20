class DemoStatic {
	private int x = 17 ;
	private boolean y = true ;
	static private int arr[] = new int[5] ;
	static {
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) ;
	}

	public DemoStatic(){
		
	}

	public DemoStatic(int a, boolean b, int r[]){
		x = a ;
		y = b ;
		arr = r ;
	}


	public void show(){
		System.out.println("x ="+ x + " y ="+y +" arr = " + arr[0]) ;
	}

	public static void showw(){
		System.out.println("arr = " + arr[0]) ;
	}

}