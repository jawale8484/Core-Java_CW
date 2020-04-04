package string;
import java.lang.*;
public class String_Demo {
	public static void main(String[] args) {
		String s="vaibhav";
		System.out.println(s);
		char ch[]= {'v','j'};
		String st[]= {"java is good "};
		for (int i = st.length-1; i >=0; i--) {
			
			System.out.println(st[i]);
		}
		
		String s1=new String(ch);
		String s2=new String("Java");
		int a=20;
		String s4=String.valueOf(a);
		System.out.println(s4);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
