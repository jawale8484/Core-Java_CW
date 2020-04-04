package polymorphism_Encapsulation;
//3.	Explain the concept of constructor overloading with suitable example
public class overload_con_3 {
	 overload_con_3() {
	System.out.println("this is un-paramerized constructor");
	}
	 overload_con_3(int a){
		 System.out.println("constructor overloading method");
		 
	 }
	public static void main(String[] args) {
		overload_con_3 ob=new overload_con_3(10);
			
	}

}
