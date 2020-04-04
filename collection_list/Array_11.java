package collection_list;
//11.	WAP to iterate through all elements in an ArrayList using for loop
import java.util.*;

public class Array_11 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for(int i=1;i<=15;i++) {
			list.add(i+" ");
		}
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}

