class UseThisMethodForConstructor {
	public static void main(String args[]){

		ThisMethodForConstructor m1 = new ThisMethodForConstructor();
		m1.show() ;

		ThisMethodForConstructor m2 = new ThisMethodForConstructor(4,5,6);
		m2.show() ;

		ThisMethodForConstructor m3 = new ThisMethodForConstructor(1,2);
		m3.show() ;

		ThisMethodForConstructor m4 = new ThisMethodForConstructor(10);
		m4.show() ;

		ThisMethodForConstructor m5 = new ThisMethodForConstructor(m3);
		m5.show() ;



	}

}