package arithematicoperation;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		int num1;
		int num2;
		int calc;

		System.out.println("This is Additon Program in Java");

		System.out.println("Enter The Two Numbers to Make Addition");

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		calc = num1 + num2;

		System.out.println("The Sum of Two Numbers is: " + calc);

	}

}
