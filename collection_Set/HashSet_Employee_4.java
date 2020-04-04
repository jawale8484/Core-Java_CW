package collection_Set;
import java.util.*;
//4.	WAP to add user defined objects of
//type Employee in a HashSet. Print the contents in the Set.

class Employee{
	int id;
	String name;
	public Employee(int a,String s) {
		this.id=a;
		this.name=s;
	}
}
public class HashSet_Employee_4 {
	public static void main(String[] args) {
		
		Employee em=new Employee(101, "Vaibhav");
		Employee emp=new Employee(102, "Nehal");
		
		HashSet hs=new HashSet();
		hs.add(em.id);
		hs.add(em.name);
		hs.add(emp.id);
		hs.add(emp.name);
		System.out.println(hs);
	}
	

}
