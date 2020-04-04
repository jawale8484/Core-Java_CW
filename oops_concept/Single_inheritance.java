package oops_concept;

import java.util.*;

class Student1 {
	String nm;
	int rollnm;

	Scanner sc = new Scanner(System.in);
	void get() {
		System.out.println("Eneter student details");
		System.out.println("Enter student namme");
		nm = sc.next();
		System.out.println("Enter roll_no");
		rollnm = sc.nextInt();
	}
}
	class mark extends Student1{
		
	
	void show() {
		System.out.println("student details is");
		System.out.println("student name is-" + nm);
		System.out.println("roll_no is-" + rollnm);
	}

}





public class Single_inheritance {
	public static void main(String[] args) {
		mark d = new mark();
		d.get();
		d.show();
	}

}
