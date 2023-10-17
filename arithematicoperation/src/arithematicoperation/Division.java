package arithematicoperation;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int num1;
		int num2;
		int calc;

		System.out.println("This is Division Program in Java");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to Perform Division");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		calc = num1 / num2;

		System.out.println("This is Division of Two Input Numbers: " + calc);

	}

}
