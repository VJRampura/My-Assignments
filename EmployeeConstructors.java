class EmployeeConstructors {
	private String name ;
	private int age ;
	private int salary ;

	//Default constructor....

	public EmployeeConstructors(){

	}

	//Parameterized constructor....

	public EmployeeConstructors(String a, int... b){
		name = a ;
		age = b[0] ;
		salary = b[1] ;
	}

	//Copy constructor....
	
	public EmployeeConstructors(EmployeeConstructors e){
		name = e.name ;
		age = e.age ;
		salary = e.salary ;
	}

	public void read(String a, int... b){
		name = a;
		age = b[0];
		salary = b[1];

	}

	public void show(){
	System.out.println("Employee Name is: "+name+", age is :"+age+", salary is: "+salary);
}
	

}