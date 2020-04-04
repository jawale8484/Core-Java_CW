package inheritance;
//1.	Write 3 Meaningful programs for single inheritance.

class demo {
	int num = 5;
	void m1() {
		System.out.println("This is parent classs method m1()");
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(result);
		}

	}
}
class demo_1 extends demo {
		int num=3;
	void m1() {
		System.out.println("This is child class method m1()");
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(result);
		}
	}
}
   public class inher_1 {

	public static void main(String[] args) {
		demo d=new demo();
		demo_1 d1 = new demo_1();
		d.m1();
		d1.m1();
	}
}
