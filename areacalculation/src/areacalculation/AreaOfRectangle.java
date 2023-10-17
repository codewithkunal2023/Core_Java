package areacalculation;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {

		int base;
		int height;
		double area;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length of Rectangle");
		base = sc.nextInt();
		System.out.println("Enter The Breadth of Rectangle");
		height = sc.nextInt();
		area = (base * height);
		System.out.println("The Area of Rectangle is: " + area);

	}

}
