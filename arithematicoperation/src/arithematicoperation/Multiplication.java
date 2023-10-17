package arithematicoperation;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		int num1;
		int num2;
		int calc;

		System.out.println("This is Multiplication Program in Java");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to Perform Multiplication");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		calc = num1 * num2;

		System.out.println("This is Multiplication of Two Input Numbers: " + calc);

	}

}
