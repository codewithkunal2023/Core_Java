package student;

public class Student {
	int sid;
	String name;
	String adrs;

	Student(int sid, String name, String adrs) {
		this.sid = sid;
		this.name = name;
		this.adrs = adrs;
	}

	void getStudent() {
		System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + name);
		System.out.println("Student Address: " + adrs);

	}

}
