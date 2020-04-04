package multithreading;


class abcd extends Thread{
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
	}
}
class xyz extends Thread{
	public void run() {
		for (int i = 11; i <=15; i++) {
			try {
				Thread.sleep(100); 
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}
}

public class Sleep_method {
	public static void main(String[] args) {
		abcd a =new abcd();
		xyz x=new  xyz();
		
		a.start();
		x.start();
	}



	}

	

