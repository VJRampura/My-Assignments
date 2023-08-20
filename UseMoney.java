class UseMoney 
{
	public static void main(String args[])
	{
		Money m1 ;
		m1 = new Money() ;
		m1.set(100,20);
		System.out.println("First Amount Is : ");
		m1.show();
		Money m2 = new Money() ;
		m2.set(200,40);
		System.out.println("Second Amount Is : ");
		m2.show() ;
	}
}