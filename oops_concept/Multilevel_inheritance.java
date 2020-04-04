package oops_concept;

import java.util.Scanner;


class student{
	String nm;
	int sub1,sub2,sub3;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("Enter name");
		 nm=sc.next();
		System.out.println("Enter marks");
		System.out.println("sub1");
	     sub1=sc.nextInt();
		System.out.println("sub2");
		sub2=sc.nextInt();
		System.out.println("sub3");
		sub3=sc.nextInt();
		
	}
}

	class Details extends student{
		 void show() {
			 System.out.println("student details are-");
			 System.out.println("Name is-"+nm);
			 System.out.println("marks is-");
			 System.out.println("sub1-"+sub1);
			 System.out.println("sub2-"+sub2);
			 System.out.println("sub3-"+sub3);
		 }
	}
		 
		 class Show_details extends Details{
			public int total;
			 void marks() {
				 System.out.println("Total marks is-");
				  total=sub1+sub2+sub3;
				 System.out.println(total);
			 }
		 
		
			 
			 		 
	}
	public class Multilevel_inheritance {
		public static void main(String[] args) {
			
		Show_details m= new Show_details();
	  m.get();
	  m.show();
	  m.marks();
	  
	}
	}
