package collection_Set;
import java.util.*;
//5.	WAP to add user defined objects of
//type Employee in a HashSet using duplicate Employee object.
public class HashSet_Employee_Duplicate_5 {
	public static void main(String[] args) {
		
		HashSet<HashSet_Employee_5> hset= new HashSet<HashSet_Employee_5>();
		
//		HashSet_Employee_5 ob=new HashSet_Employee_5(101, "Vaibhav");
		
		
		
//		HashSet_Employee_5  hemp;
		hset.add(new HashSet_Employee_5(101,"vaibhav"));
		hset.add(new HashSet_Employee_5(102,"Nehal"));
		hset.add(new HashSet_Employee_5(103,"sopil"));
		
		
		//iterate Hashset using Iterator
		Iterator itr =hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		hset.add(new HashSet_Employee_5(101,"vaibhav"));
		Iterator itr1 =hset.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
	
	}
}
