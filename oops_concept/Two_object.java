package oops_concept;
//2.	WAP to access different methods and variables by creating two objects of a class.
public class Two_object {
public void get() {
	System.out.println("this is get method");
	
}

public void show() {
	System.out.println("this is show metho");
	
}
public static void main(String[] args) {
	Two_object tw=new Two_object();
	Two_object tw1=new Two_object();
			tw.get();
			tw.show();
			tw1.get();
			tw1.show();
}
}
