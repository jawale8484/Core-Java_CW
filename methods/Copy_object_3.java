package methods;

import java.util.Scanner;

/*3.	Write a program to copy values of one object into 
another by assigning the values of one object into another.
*/

class Object {
	Scanner sc = new Scanner(System.in);

	int num1, num2;

	public Object() {
		System.out.println("Enter 1st value");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd value");
		num2 = sc.nextInt();

	}

}

public class Copy_object_3 {
	public static void main(String[] args) {
		Object o1 = new Object(); // creating first object
		System.out.println("First object" + o1.num1 + " " + o1.num2);

		Object o2; // creating unrefrance second object

		o2 = o1; // Copy Object o1 to o2

		System.out.println("Second object" + o2.num1 + " " + o2.num2);
	}
}
