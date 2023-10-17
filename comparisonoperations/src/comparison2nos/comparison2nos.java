package comparison2nos;

import java.util.Scanner;

public class comparison2nos {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Enter Number to Compare:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		a=sc.nextInt();
		System.out.println("Enter Number 2:");
		b=sc.nextInt();
		
		if (a>b) {
			System.out.println("Number A is Greater: "+a);
		}
		else {
			System.out.println("Number B is Greater: "+b);
		}
	}

}
