package comparison3nos;
import java.util.Scanner;
public class comparison3nos {
	public static void main(String[] args) {
		int a,b,c;
				System.out.println("Enter Number to Comparison Between 3 Numbers:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		a = sc.nextInt();
		System.out.println("Enter Number 2:");
		b = sc.nextInt();
		System.out.println("Enter Number 3:");
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("Number A is Greater: " + a);
		}
		if (b > a && b > c) {
			System.out.println("Number B is Greater: " + b);
		}
		if (c > a && c > b) {
			System.out.println("Number C is Greater: " + c);
		}
	}
}
