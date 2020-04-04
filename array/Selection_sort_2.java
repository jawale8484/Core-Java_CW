 package array;
// program for selection sort. 

import java.util.Scanner;

public class Selection_sort_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " element in array-");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements in array are-");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		int min, temp = 0;
		for (int i = 0; i < size; i++) {
		
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Soreted Elements in array-");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" "); 
		}

	}

}
