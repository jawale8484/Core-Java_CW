package collection_Set;

import java.util.*;
/*1.	WAP to retrieve and remove the lowest element of a TreeSet
using a single method call.
Repeat the same using 2 different method calls.

*/

public class Tree_Set_1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(55);
		ts.add(5);
		ts.add(01);
		Iterator it = ts.iterator();
		System.out.println(ts);
		ts.pollFirst();
		System.out.println("retrieve and remove the lowes");
		System.out.println(ts);
	
		
	}

}
