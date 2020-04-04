package class_work.programs;

public class Subject {
	public static void main(String[] args) {
		int sub1=55,sub2=85,sub3=66,sub4=66,sub5=85;
		int total;
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total marks="+total);
		double avg=total/500d;
		System.out.println("Avergae-"+avg);
		
		double per=(total/500d)*100d;
		System.out.println("percentage-"+per);
		
	}

}
