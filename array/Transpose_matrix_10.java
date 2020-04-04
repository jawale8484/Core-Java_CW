package array;

import java.util.Scanner;

//10.AP to create transpose of a matrix 
//(transpose is converting rows to columns) and print it.
public class Transpose_matrix_10 {
	public static void main(String[] args) {
		int row,col;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row & col of array");
		row=sc.nextInt();
		col=sc.nextInt();
		
		//array declaration
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		
		//first array....
		System.out.println("Enter  elements in first  array-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j]=sc.nextInt();				
			}			
		}
		
		System.out.println("Element's in first  array are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println();
		}
		
			//transpose matrix logic
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[j][i]=arr1[i][j];
			}
		}
		
		System.out.println("Transpose matrix are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr2[i][j]+" ");
				
			}
			System.out.println();
		}
		
}}

