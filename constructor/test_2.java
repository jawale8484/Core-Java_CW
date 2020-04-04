package constructor;

import java.util.Scanner;

/*2.	Create a class Test with 2 constructors and
 *  3 methods with zero, one and two parameters respectively.
 *   Methods should perform following programs:
a.	Even odd
b.	Factorial of a number using do-while loop.
c.	Find sum of all digits of a number*/

public class test_2 {
	test_2() {
		System.out.println("This is zero parameter constuctor");
	}

	test_2(int i) {
		System.out.println("This is one parameter constuctor");

	}

	void t1() {
		// Even odd
		System.out.println("Even number are-");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(" "+i);
			}

		}
		System.out.println();
		System.out.println("Odd numbers are-");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(" "+i);
			}
		}
	}

	void t1(int num) {
		// FActorial of no using do-while loop
		int result = 1;
		do {
			result = result * num;
			num--;
		} while (num != 0);
		System.out.println();
		System.out.println("Factorial-" + result);
	}

	void t1(int i, int j) {
		/*
		 * // sum of all digits 
		 * int result=i/10; //System.out.println(result); 
		 *int  temp=i%10; 
		 * //System.out.println(temp); 
		 * int sum=result+temp;
		 * System.out.println("sum of digits-"+sum);
		 */
		int add,result=0;
		while(i!=0) {
		 add=i%10;
		 i=i/10;
		 result=result+add;
		}
		System.out.println("Addition is");
		System.out.println(result);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test_2 t = new test_2();
		test_2 tt = new test_2(10);

		t.t1();
		t.t1(5); 
		t.t1(252, 20);

	}
}
