package class_work.programs;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int Phys,Chem, Bio, Math,Comp;
		System.out.println("Enter the marks");
		int phys=sc.nextInt();
		int chem=sc.nextInt();
		int Bio=sc.nextInt();
		int Math=sc.nextInt();
		int Comp=sc.nextInt();
		
		int total=(phys+chem+Bio+Math+Comp);
		System.out.println("total-"+total);
		double per=(total/500d);
		double percentage=per*100d;
		System.out.println("percentage="+percentage);
		
		if(percentage>=90) {
			System.out.println("A Grade");
		}
		else if(percentage>=80) {
			System.out.println("B Grade");
		}
		else if(percentage>=70) {
			System.out.println("C Grade");
		}
		
	}

}
