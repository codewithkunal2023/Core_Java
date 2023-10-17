package areacalculation;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		int side;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Side of Square");
		side = sc.nextInt();
		area = side * side;
		System.out.println("The Area of Square is: " + area);

	}

}
