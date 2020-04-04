package input_output;

import java.io.*;

public class Output {
	public static void main(String[] args) {
	     try {
			FileOutputStream f =new FileOutputStream("D:\\vaibhav.txt");
			String s="Welcome to Java";
			byte[] b=s.getBytes();
			f.write(b);
			f.close();
			System.out.println("Success.....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

