package arithematicoperation;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		int num1;
		int num2;
		int calc;

		System.out.println("This is the Substraction Program in Java");

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		calc = num1 - num2;

		System.out.println("The Substraction of Two Numbers is: " + calc);

	}

}
