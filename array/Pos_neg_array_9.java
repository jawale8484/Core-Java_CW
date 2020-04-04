package array;
//9.	Write a Java program to arrange the elements of an given array of integers where 

//all positive integers appear before all the negative integers using additional   array.

public class Pos_neg_array_9 {
	public static void main(String[] args) {
		
		//Array declaration
		int arr[] = { 11, -22, 33, -44, 55, 8, -55, 78 };
		int arr1[]=new int [arr.length];		
		
		int count=0;
			for (int i = 0,j=0; i < arr.length; i++) {
				if(arr[i]>0) {  //compare positive 
					arr1[j]=arr[i];
					count++;
					j++;
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<0) {     //Compare negative
					arr1[count]=arr[i];
					count++;
				}
			}
			
			//print array
			System.out.println("positive integers appear before all the negative integers-");
			System.out.println();
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
		
		

	}

}
