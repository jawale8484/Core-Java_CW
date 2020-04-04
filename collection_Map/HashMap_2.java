package collection_Map;

import java.util.*;
import java.util.Map.Entry;

/*2.	WAP to get a key-value mapping associated with the greatest
key less than or equal to the given key
*/
public class HashMap_2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(101, "Vaibhav");
		hm.put(102, "Ashu");
		hm.put(103,"Nehal");
		hm.put(104,"Jadu");
		
		Scanner sc=new Scanner(System.in);
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\n Enter The Key You Want to Search the greatest\r\n" + 
				"key less than or equal to the given key-");
		int val=sc.nextInt();
		System.out.println(hm.floorEntry(val));
		
		HashMap ob=new HashMap(hm);
		System.out.println(ob);
		
	}
}
