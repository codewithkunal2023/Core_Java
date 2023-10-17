package library;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	int bookid;
	String bookname;
	int price;
	
	Book b1=new Book();
	

	System.out.println("Enter Book ID");
	bookid=sc.nextInt();
	System.out.println("Enter Book Name: ");
	bookname=sc.next();
	System.out.println("Enter Book Price: ");
	price=sc.nextInt();
	
	b1.ShowBook(bookid, bookname, price);
	
	
	
	
	

	}

}
