package collection_Set;

import java.util.*;

//3.	WAP to remove all of the elements from a HashSet.
public class HashSet_Remove_3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		for (int i = 11; i <=15; i++) {
			hs.add(i);
		}
		System.out.println(hs);
		
		hs.add("java");
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println(hs);
		
	}
}
