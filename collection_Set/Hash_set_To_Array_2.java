package collection_Set;

import java.util.*;

//2.	WAP to convert a HashSet to an array.
public class Hash_set_To_Array_2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		for (int i = 1; i <= 5; i++) {
			hs.add(i);
		}
		hs.add("vaibhav");
		System.out.println(hs);
		
		Object ob[]=hs.toArray();
		for (int i = 0; i < ob.length; i++) {
			System.out.print(ob[i]+" ");
		}
	}
}
