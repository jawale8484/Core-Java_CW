package multithreading;
//1.	Change priorities of thread. 

//Check what values are for MIN_PRIORITY, NORM_PRIORITY and MAX_PRIORITY.

class program_1 extends Thread {
	public void run() {
		System.out.println("Hello");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		program_1 ob = new program_1();
		System.out.println("before---");
		System.out.println(ob.getPriority());
		System.out.println("After-----");
		ob.setPriority(MAX_PRIORITY);
		System.out.println("max-" + ob.getPriority());
		ob.setPriority(MIN_PRIORITY);
		System.out.println("min-" + ob.getPriority());
		ob.setPriority(NORM_PRIORITY);
		System.out.println("Norm-" + ob.getPriority());
		ob.start();

	}
}
