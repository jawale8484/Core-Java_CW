package queue;

import java.util.*;

//4.	WAP to attempt to remove non-existing elements from a queue
public class Queue_Remove_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q =new PriorityQueue();
		q.offer(55);
		q.add(44);
		q.offer(99);
		q.offer(33);
		q.offer(77);
		System.out.println(q);
		System.out.println();
		System.out.println("Enter Elments ");
		int el=sc.nextInt();
		
		if(q.contains(el)) {
			q.remove(el);
			System.out.println("The Elments are Presents in Queue");
			System.out.println("Elements are deleted");
			System.out.println(q);
		}else {
			System.out.println("The elments are not presents in queue");
		}
		
	}
}
