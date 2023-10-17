package areacalculation;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int base;
		int height;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Base of Triangle");
		base = sc.nextInt();
		System.out.println("Enter The Height of Triangle");
		height = sc.nextInt();
		area = (base * height) / 2;
		System.out.println("The Area of Triangle is: " + area);
	}

}
