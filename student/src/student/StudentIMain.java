package student;

import java.util.Iterator;
import java.util.Scanner;

public class StudentIMain {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int id;
		int i;
		String name;
		String adrs;
		
		Student S[]=new Student[2];
		
		for ( i = 0; i < S.length; i++) {
			System.out.println("Student ID: " );
			id=sc.nextInt();
			System.out.println("Student Name: ");
			name=sc.next();
			System.out.println("Student Address: ");
			adrs=sc.next();
			
			S[i]=new Student(id,name,adrs);
		}
		for ( i = 0; i < S.length; i++) {
			S[i].getStudent();
			System.out.println("=================================");
		}
	}

}
