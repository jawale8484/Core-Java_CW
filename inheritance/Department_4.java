package inheritance;
import java.io.*;
import java.util.*;

/*4.	WAP to have Department class created with id, name.
Student class has roll, name and Department object should have id and name. 
Assign and print individual values in main method*/

class Department_4 {
	int id;

	public Department_4(int id) {
		this.id = id;
	}
}

class Student extends Department_4 {
	int rollno;
	String name;
	Department_4 d;

	Student(int rollno, String name, Department_4 d) {
		super(d.id);
		this.rollno = rollno;
		this.name = name;

	}

	void display() {
		System.out.println("id-" + id + "\nname-" + name + "\nRoll no-" + rollno);
	}

	public static void main(String[] args) {
		Student ob = new Student(10, "vaibhav", new Department_4(5));
		ob.display();
	}
}
