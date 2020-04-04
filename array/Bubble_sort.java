package array;

import java.util.*;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enteelements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Bubble sort
		int temp;
		System.out.println("USing Bubble sort");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}
	
}
