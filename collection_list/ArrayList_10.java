package collection_list;
import java.util.*;
//10.	WAP to print all elements of ArrayList using iterator
public class ArrayList_10 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(15);
		list.add("java");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
