package collection_list;

import java.util.*;

//3.	WAP to search an element from ArrayList
//4.	WAP to search the specified collection in this collection
public class SearchArrayList_3_4 {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add(10);
		ls.add('n');
		ls.add(15);
		ls.add("java");
		ls.add(101);
		System.out.println(ls);
		System.out.println(ls.contains(10)); // contains method are used for check availabilty

		// check collection are available in collection list
		List ls2 = new ArrayList();
		System.out.println(ls2.containsAll(ls));
		ls2.add("hii");
		ls2.addAll(ls);
		ls2.add("ashu");
		System.out.println(ls2.containsAll(ls));

	}
}
