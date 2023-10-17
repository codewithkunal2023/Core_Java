package patterns;

import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		int lim;

		System.out.println("This is Patterns Program in Java");
		System.out.println("Select Pattern to Print from The Option");
		System.out.println("1. Right Angle Triangle");
		System.out.println("2. Inverted Right Angle Triangle");
		System.out.println("3. Left Side Right Angle Triangle");
		System.out.println("4. Left Side Inverted Right Angle Triangle");
		System.out.println("5. Return to Home");
		System.out.println("Enter Your Pattern Choice: ");
		op = sc.nextInt();
		System.out.println("Enter Your Pattern Lines Number: ");
		lim = sc.nextInt();

		switch (op) {
		case 1:
			right_angle_triangle(lim);

			break;
		case 2:
			inverted_right_angle_triangle(lim);

			break;

		default:
			break;
		}

	}

	private static void inverted_right_angle_triangle(int lim) {
		int i;
		int j;
		for (i = lim; i >= 1; i--) { 
			  
         
            for (j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
           
            System.out.println(); 
        } 
		
	}

	private static void right_angle_triangle(int lim) {
		int i;
		int j;
		for (i = 1; i <= lim; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
