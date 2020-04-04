package multithreading;
//4.	WAP to set & get priorities of a threa¬d

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class abc extends Thread{
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("hello Java");
		}
	}
}

public class Set_Get_priority_4 {
	public static void main(String[] args) {
		abc a=new abc();
		System.out.println("Afetr set");
		a.setPriority(7);
		System.out.println(a.getPriority());
		a.start();
		System.out.println(a.getPriority());
	}

}
