package collection_list;

import java.util.*;

//5.	WAP to retrieve an element (at a specified index) from a given ArrayList
public class Progr_5 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(15);
		list.add("java");
		System.out.println(list);

		System.out.println(list.get(2));

	}

}
