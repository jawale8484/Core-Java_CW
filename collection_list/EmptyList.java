
package collection_list;
//2.	WAP to empty ArrayList
import java.util.*;
public class EmptyList {
public static void main(String[] args) {
	List list=new ArrayList();
	
	System.out.println(list.isEmpty());
	list.add(12);
	list.add("vaibhav");
	System.out.println(list.isEmpty());
}
}
