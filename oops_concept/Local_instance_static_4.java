package oops_concept;
/*
4.	WAP to show the implementation and use of local, instance
	and static variables in different context.*/




class Abc{
	//instance variable
	int inst=5;
	
	//static variable
	static int st=15;
	void show()
	{
		System.out.println("Instance variable-"+inst);
		//Local variable
		int loc=10;
		System.out.println("Local variable-"+loc);
		
		//Static variable
	
		System.out.println("Static variable-"+st);
		
	}
	
}

public class Local_instance_static_4 {
	 
public static void main(String[] args) {
	Abc a=new Abc();
	a.show();
	
	
}
}
