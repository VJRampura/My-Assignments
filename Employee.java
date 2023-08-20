import java.io.* ;
class Employee
{
	private String name;
	private int age;
	private int salary ;
	public void read(String n, int a, int s) {
		name = n ;
		age = a ;
		salary = s ;
	}

	public void read(){
		Console cn = System.console();
		name = cn.readLine() ;
		age = Integer.parseInt(cn.readLine());
		salary = Integer.parseInt(cn.readLine());
	}

	public void show()
	{
		System.out.println("Employee Name Is: " +name);
		System.out.println("Employee Age Is: " +age);
		System.out.println("Employee Salary Is: " +salary);
	}

}