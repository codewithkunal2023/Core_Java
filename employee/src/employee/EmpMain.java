package employee;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id;
		String name;
		String desig;
		String sal;

		Employee E1=new Employee();
		System.out.println("Enter ID Of Employee: ");
		id=sc.nextInt();
		System.out.println("Enter Name Of Employee: ");
		name=sc.next();	
		System.out.println("Enter Designation Of Employee: ");
		desig = sc.next();
		System.out.println("Enter Salary Of Employee: ");
		sal=sc.next();
		
		E1.setEmp(id,name, desig, sal);
		E1.getEmp();
		
	}

}
