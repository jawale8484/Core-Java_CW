package multithreading;


class m1 extends Thread{
	public void run() {
		for (int i =1; i < 6;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class m2 extends Thread{
	public void run() {
		for (int i = 25; i < 36; i++) {
			System.out.println(i);
		}
	}
}


public class Yieald_method  {
	
	
	public static void main(String[] args) {
		m1 ob1=new m1();
		m2 ob2=new m2();
		ob1.start();
		for (int i = 1; i < 6; i++) {
			
			ob1.yield();
		}
		ob2.start();
		
		
		
	}
	
}

