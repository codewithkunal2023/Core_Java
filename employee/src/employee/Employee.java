package employee;

public class Employee {
	int id;
	String name;
	String desig;
	String sal;
	
	void setEmp(int id,String name,String desig,String sal) {
		this.id=id;
		this.name=name;
		this.desig=desig;
		this.sal=sal;
	}
	
	void getEmp() {
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Designation: "+desig);
		System.out.println("Employee Salary: "+sal);

	}
}
