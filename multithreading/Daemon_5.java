package multithreading;
//5.	WAP to show example of daemon thread.



public class Daemon_5 extends Thread{
	
	public void run() {
		System.out.println("Hello java");
	}
	
	
	
	public static void main(String[] args) {
		Daemon_5 ob=new Daemon_5();
		System.out.println("Before---");
		System.out.println("is daemon-"+ob.isDaemon());
		System.out.println("After---");
		ob.setDaemon(true);
		System.out.println("is daemon "+ob.isDaemon());
		ob.start();
	}

}
