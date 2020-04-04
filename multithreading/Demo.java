package multithreading;
class Demo1 extends Thread{
public void run() {
	//System.out.println("Hello");
	for (int i = 1; i <= 5; i++) {
		System.out.println(i);
	}
}
}
public class Demo extends Thread{

public static void main(String[] args) {
	Demo1 ob=new Demo1();
	ob.start();
	System.out.println(ob.getName());
	
	Demo obDemo=new Demo();
	
	System.out.println(obDemo.getName());
	System.out.println("main befor"+obDemo.getPriority());
	obDemo.setPriority(5);
	System.out.println("main after"+obDemo.getPriority());	
}

}