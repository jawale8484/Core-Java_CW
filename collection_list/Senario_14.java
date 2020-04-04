package collection_list;

import java.util.*;

class Emp {
	int id;
	String name;
	float salary;
}

public class Senario_14 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Emp ob1 =new Emp();
		Emp ob2=new Emp();
		list.add(ob1);
		list.add(ob2);
		System.out.println(list);
		
	}

}
