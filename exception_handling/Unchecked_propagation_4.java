package exception_handling;
//4.	WAP to check whether Unchecked Exception is propagated in calling stack.

import java.util.Scanner;

public class Unchecked_propagation_4 {
	Scanner sc = new Scanner(System.in);

	void m1() {
		System.out.println("Enter the size of array-");
		int size = sc.nextInt();
		//int arr1[]=new int[5];
		int arr[] = new int[size];
		try {
			System.out.println("Enter Elments in array");
			for (int i = 0; i <= size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Elments in array-");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			System.out.println("Array size is out of...");
			e.printStackTrace();
		}finally {
			System.out.println("End-Of_Programj");
		}

	} 
	void m2() {
		this.m1();
	}
	void m3() {
		this.m2();
	}
	public static void main(String[] args) {
		Unchecked_propagation_4 ob=new Unchecked_propagation_4();
		ob.m3();
	}

}
