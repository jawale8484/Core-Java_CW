package collection_list;

import java.util.*;

//13.	WAP to insert the specified element at the specified position in the linked list.
public class LinkedList_13 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(15);
		list.add("januu");
		list.add(12);
		list.add(13);
		list.add(15);
		System.out.println(list);
		System.out.println("After....");		
		list.addFirst(10);
		list.addLast("java");
		System.out.println(list);
	}
}
