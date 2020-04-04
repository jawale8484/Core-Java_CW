package collection_list;
import java.util.*;
//1.	WAP to add an element at a particular index using Add().
public class Add_ArrayList_1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(5);
		list.add("vaibhav");
		list.add(10);
		list.add(11);
		list.add("jawale");
		System.out.println(list);
		
		list.add(4, "kishor");
		System.out.println(list);
		
		
	}

}
