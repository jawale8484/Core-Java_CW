package constructor;
//3.	Create a class Test, create 4 

//constructors explaining the concept of constructor overloading

public class Test_3 {
	 Test_3() {
		 System.out.println("This is zero paramaterised constuctor");
	} Test_3(int i){
		
		System.out.println("This is one paramaterised constuctor");
	}
	Test_3(int i ,int j){
		System.out.println("this is two paramaterised constuctor");
	}
	Test_3(String c){
		System.out.println("This is one String paramaterised constuctor");
	}
 public static void main(String[] args) {
	Test_3 t=new Test_3();
	Test_3 t1=new Test_3(10);
	Test_3 t2=new Test_3(10, 20);
	Test_3 t3 =new Test_3("vaibhav");
}
}
