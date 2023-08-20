import java.io.* ;
class Office {
	public static void main(String args[]){
		Employee emp = new Employee() ;
		Console cn = System.console() ;

	//Option one....
		cn.printf("Enter Employee Name, Age And Salary : \n") ;
		emp.read(cn.readLine(), Integer.parseInt(cn.readLine()), Integer.parseInt(cn.readLine())) ;
		cn.printf("Employee Details Are : \n") ;
		emp.show() ;
		
	//Option Two.....
		cn.printf("Enter New Employee Name, Age And Salary : \n") ;
		emp.read() ;
		cn.printf("Employee  New Details Are : \n") ;
		emp.show() ;

	//Option Three....
		cn.printf("Enter Employee Name, Age And Salary : \n") ;
		emp.read("Vijay",26,25000) ;
		cn.printf("Employee Details Are : \n") ;
		emp.show() ;

	}
}