package multithreading;
class mm extends Thread{
	public void run() {
		for (int i = 1; i < 6; i++) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		}
	}

}
class mmm extends Thread{
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Hello");
		}
	}
}

public class Join_Method {
	public static void main(String[] args) {
		mm ob1=new mm();
		mmm ob2=new mmm();
		ob1.start();
		ob2.start();
		
			
			try {
				ob2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
