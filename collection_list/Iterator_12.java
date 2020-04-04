package collection_list;
import java.util.*;
//12.	WAP to iterate a linked list in reverse order.
public class Iterator_12 {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(15);

		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
