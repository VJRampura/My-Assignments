class StaticVar {
	private int x ;
	private int y ;
	 static int z = 0 ;
	/*final private int z = 20 ;
	final private static int a = 30 ;
	final private int b ;
	final private static int c ;*/
	public StaticVar(){
		x=y=0 ;
		z++ ;
		
	}

	public StaticVar(int r, int s){
		x = r;
		 set(s) ;
		z++;
		
	}
	public  StaticVar( StaticVar m ){
		x = m.x ;
		y = m.y ;
		z++ ;	
	}

	public void set(int q){
		y = q ;
	}

	public void show(){
		System.out.print(z + " ") ;
	}

}