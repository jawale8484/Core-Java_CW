package string;
//7.	WAP to split string into 2 tokens where string is “HELLO=WORLD”
public class Spilt_string_7 {
	public static void main(String[] args) {
		
		//Split method...
	String s="Hello=Word";
	
	String arr[]=s.split("=");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}	
	}//

}
