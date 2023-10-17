package evenoddnumberarray;

import java.util.*;

public class EvenOddSort {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers in array to Get Even Numbers: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Even Numbers are: ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}
		System.out.println("Odd Numbers are: ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}
	}
}
