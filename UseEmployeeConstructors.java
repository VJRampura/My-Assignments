class UseEmployeeConstructors {
	public static void main(String args[]){
		EmployeeConstructors e1 = new EmployeeConstructors();
		e1.show();

		EmployeeConstructors e2 = new EmployeeConstructors("Vijay",26,20000);
		e2.show();

		EmployeeConstructors e3 = new EmployeeConstructors(e2);
		e3.show();

	}
}