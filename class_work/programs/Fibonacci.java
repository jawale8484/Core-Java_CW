package class_work.programs;

public class Fibonacci {
public static void main(String[] args) {
	int total,num1=0,num2=1;
	for (int i = 0; i <=10; i++) {
		total=num1+num2;
		num2=total;		 
		num1=num2;
		System.out.println(num1);
	} 
}
} 