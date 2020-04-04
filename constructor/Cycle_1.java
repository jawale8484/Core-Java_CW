package constructor;

//1.	Create a class Cycle with member variables: int accountNo, int noOfWheels.
//Create a default constructor with a SOP in it “I am default constructor”.
//Create another constructor which takes 2 arguments, calls the default constructor 
//using this () and has a SOP in it “I am another constructor”. In main method, 
//create an object of type Cycle by using default constructor. Note the output.
//Create another object of type Cycle by using the parameterized constructor. 
//Note the sequence of SOPs indicating that inner most constructors are called first.

public class Cycle_1 {
	int accno;
	int noOfwheels;
	Cycle_1(){
		System.out.println("I an default constuctoe");
	}
   Cycle_1(int i){
	   this();
	   System.out.println("I am another constructor");
   }
   public static void main(String[] args) {
	 Cycle_1 c=new Cycle_1();
	 Cycle_1 c1=new Cycle_1(10);
}
}
