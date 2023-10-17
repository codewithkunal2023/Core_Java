package areacalculation;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		double pi = 3.14;
		int rad = 0;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius of Circle");
		rad = sc.nextInt();
		area = pi * (rad * rad);
		System.out.println("The Area of Circle is: " + area);

	}

}
