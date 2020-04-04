package collection_Map;

import java.util.*;

/*
1.	WAP to add elements to a HashMap without using generics 
(ie do not use <>) and print content of it. Use Integer as Key and String as Value. 
In second HashMap
add elements of String type as Key and Integer as Value.
*/public class HashMap_1 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(101, "vaibhav");
		hm.put(102, "Nehal");
		hm.put(103, "Nanu");

		System.out.println(hm);
		System.out.println("");

		Set st = hm.entrySet();
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
