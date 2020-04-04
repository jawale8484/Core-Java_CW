package methods;

/*2.	How to overload methods*/
public class Method_overload_2 {

	void get(int a, int b) {
		int add = a + b;
		System.out.println("addition of two variable-" + add);

	}
	void get(int a, int b, int c) {
		int add = a+b+c;
		System.out.println("addtion of three variable-"+add);
	}
public static void main(String[] args) {
	Method_overload_2 m=new Method_overload_2();
	m.get(5, 5);
	m.get(10, 15, 25);
}
}
