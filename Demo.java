class Demo {
	private int x = 17 ;
	private boolean y = true ;
	private int arr[] = new int[5] ;
	{
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 100) ;
	}

	public Demo(){
		
	}

	public Demo(int a, boolean b, int r[]){
		x = a ;
		y = b ;
		arr = r ;
	}


	public void show(){
		System.out.println("x ="+ x + " y ="+y +" arr = " + arr[0]) ;
	}

	


}