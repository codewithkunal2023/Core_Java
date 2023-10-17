package vovelconsonentcheck;

import java.util.Scanner;

public class BVovelCheck {

	public static void main(String[] args) {
		char op;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter The Letter to Check Whether it is Consonent or Vovel: ");
		op = sc.next().charAt(0);

		switch (op) {
		case 'a':
			System.out.println("Entered Charachter is Vovel");

			break;

		case 'e':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'i':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'o':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'u':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'A':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'E':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'I':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'O':
			System.out.println("Entered Charachter is Vovel");

			break;
		case 'U':
			System.out.println("Entered Charachter is Vovel");

			break;

		default:
			System.out.println("Entered Charachter is Consonent or Invalid Charachter");
			break;
		}
	
	}
	
}
