package collection_list;

import java.util.*;

//8.	WAP to set or replace an element using set().
public class Programs_8_to {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(15);
		list.add("hello");
		list.add(30);
		System.out.println(list);
		list.set(3, "java");
		System.out.println(list);

	}

}
