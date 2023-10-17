package crud_in_java;

import java.sql.*;
import java.util.*;

import com.mysql.cj.x.protobuf.MysqlxSession.AuthenticateContinue;

public class crud_main {

	public static void main(String[] args) {

		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/db_contact2023";
		String USER = "root";
		String PASS = "root";

		try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = con.createStatement();
			String query = "CREATE TABLE IF NOT EXISTS tbl_contact (\r\n"
					+ "contact_id INT AUTO_INCREMENT PRIMARY KEY,\r\n" + "first_name VARCHAR(50) NOT NULL,\r\n"
					+ "last_name VARCHAR(50) NOT NULL,\r\n" + "email VARCHAR(100),\r\n"
					+ "phone_number VARCHAR(20),\r\n" + "address TEXT\r\n" + ");";
			stmt.executeUpdate(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("=============================================================================");
			System.out.println("\t\t\t\tAXACT CONTACT MANAGER");
			System.out.println("=============================================================================");
			System.out.println("Menu:");
			System.out.println("1.Add Contact");
			System.out.println("2.Search User");
			System.out.println("3.Update User");
			System.out.println("4.Delete User");
			System.out.println("5.Show All Contacts");
			System.out.println();
			System.out.println("Enter Your Choice: ");

			String ch = sc.next();

			menu: switch (ch) {
			case "1":
				System.out.println("Enter First Name: ");
				String f_name = sc.next();

				System.out.println("Enter Last Name: ");
				String l_name = sc.next();

				System.out.println("Enter Email: ");
				String email = sc.next();

				System.out.println("Enter Phone Number: ");
				String p_n = sc.next();

				System.out.println("Enter Address: ");
				String adrs = sc.next();

				query = "INSERT INTO tbl_contact (first_name, last_name, email, phone_number, address)VALUES('" + f_name
						+ "','" + l_name + "','" + email + "','" + p_n + "','" + adrs + "') ";
				stmt.executeUpdate(query);
				System.out.println();
				System.out.println("Record Inserted into Database");

				break;

			case "2":
				System.out.println("Enter Contact ID: ");
				int id = sc.nextInt();
				query = "SELECT * FROM tbl_contact WHERE contact_id=" + id;
				ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
					System.out.println("First Name: " + rs.getString("first_name"));
					System.out.println("Last Name: " + rs.getString("last_name"));
					System.out.println("Email: " + rs.getString("email"));
					System.out.println("Contact: " + rs.getString("phone_number"));
					System.out.println("Address: " + rs.getString("address"));

				} else {
					System.out.println("Contact Not Found!");
				}
				break;

			case "3":
				System.out.println("Enter User ID:");
				String Uid = sc.next();

				System.out.println("Enter New Email:");
				String Uemail = sc.next();

				System.out.println("Enter New Contact:");
				String UContact = sc.next();

				query = "UPDATE tbl_contact SET email='" + Uemail + "',phone_number='" + UContact
						+ "' WHERE contact_id=" + Uid;

				int result = stmt.executeUpdate(query);
				if (result > 0) {
					System.out.println("Record Updated In Database");

				} else {
					System.out.println("User Not Found!");
				}

				break;

			case "4":
				System.out.println("Enter ID:");
				String Did = sc.next();
				query = "DELETE FROM tbl_contact WHERE contact_id=" + Did;

				result = stmt.executeUpdate(query);
				if (result > 0) {
					System.out.println("Record Deleted from Database");

				} else {
					System.out.println("Contact Not Found!");
				}
				break;

			case "5":
				query = "SELECT * FROM tbl_contact";
				ResultSet ars = stmt.executeQuery(query);
				System.out.println("=============================================================================");
				System.out.println("\t\t\tLATEST CONTACT RECORDS ON DATABASE");
				System.out.println("=============================================================================");

				while (ars.next()) {

					System.out.println("Contact ID: " + ars.getInt("contact_id"));
					System.out.println("Full Name: " + ars.getString("first_name") + " " + ars.getString("last_name"));
					System.out.println("First Name: " + ars.getString("first_name"));
					System.out.println("Last Name: " + ars.getString("last_name"));
					System.out.println("Email: " + ars.getString("email"));
					System.out.println("Phone Number: " + ars.getString("phone_number"));
					System.out.println("Address: " + ars.getString("address"));
					System.out.println("=============================================================================");

				}

				break;
			default:
				break;
			}

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error!" + e.getMessage());
		}

	}
}
