package collection_Map;
import java.util.*;
//3.	WAP add elements to HashMap without using generics, 0th location use
//String as key and Integer as value, 
//on 1st location use String as key String and Integer as value.
public class HashSet_3 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		System.out.println("HaspMap");
		hs.put("Vaibhav", 101);
		hs.put("Computer", 102);
		
		System.out.println(hs);
		
		
		

//4.	WAP to get the greatest key less than or equal to the given key
		System.out.println("\n TreeMap");
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(101, "Ghamendrya");
		tm.put(102, "Ghamika");
		tm.put(105, "naau");
		tm.put(55, "Sopil");
		System.out.println(tm);
		System.out.println();
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n Greatest key less than or equal to the given key");
		System.out.println(tm.lastKey());
	}
}
