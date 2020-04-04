package queue;

import java.util.*;

//1.	Use 2 different method calls to add elements to a queue.
//2.	WAP to check if a queue has values
//3.	WAP to create a Queue with Integer objects 
public class Queue_Programs_1_3{
	public static void main(String[] args) {
		Queue q = new PriorityQueue(); // set the elements by there priority
		q.offer(11);
		q.offer(55);
		q.offer(99);
		q.add(55);
		q.add(44);
		System.out.println(q);
		
		if(q.isEmpty()) {
			System.out.println("Quque is Empty");
		}else {
			System.out.println("Elements are Presents in Quque");
			System.out.println(q);
		}
		System.out.println("\n Queue with Integer objects ");
		System.out.println(q);
		
		
	}
}
