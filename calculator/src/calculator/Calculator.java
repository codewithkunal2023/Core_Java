package calculator;

import java.util.*;
import java.lang.*;

public class Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int res = 0;
		char op;

		System.out.println("Welcome to Java Calculator");
		System.out.println("1. Addition +");
		System.out.println("2. Substraction -");
		System.out.println("3. Multiplication *");
		System.out.println("4. Division /");

		System.out.println("Enter Your Choice: ");
		Scanner sc = new Scanner(System.in);

		op = sc.next().charAt(0);

		System.out.println("Enter Number 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		num2 = sc.nextInt();

		switch (op) {
		case '1':
			res = num1 + num2;
			break;
		case '2':
			res = num1 - num2;

			break;
		case '3':
			res = num1 * num2;

			break;
		case '4':
			res = num1 / num2;

			break;

		default:
			System.out.println("Invalid Input / Invalid Choice");
			break;
		}

		System.out.println("Result= " + res);

	}

}
