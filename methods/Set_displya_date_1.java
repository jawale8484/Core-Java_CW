package methods;

import java.io.*;
import java.util.*;
/*1.	Create Mydate class which have 3 instance variables
(day, month, and year). Create two methods setDate() and displayDate() 
for Mydate class where write a logic for assigning some values to instance 
variable in setDate and display logic in displayDate() method.*/

class My_date {
	int day, month, year;
	Scanner sc = new Scanner(System.in);

	void set_Date() {
		System.out.println("Enter day");
		day = sc.nextInt();
		System.out.println("Enter month");
		month = sc.nextInt();
		System.out.println("Enter year");
		year = sc.nextInt();

	}
	void display_date() {
		System.out.println("Date is-"+day+"/"+month+"/"+year);
		
		
	}
}   

public class Set_displya_date_1 {
	public static void main(String[] args) {
		
		My_date m=new My_date();
		m.set_Date();
		m.display_date();
	}
   
}
