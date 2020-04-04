package input_output;

import java.io.*;
public class Input {
	public static void main(String[] args) {
		try {
			
			FileInputStream f=new FileInputStream("D:\\vaibhav.txt");
			int i=0;
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
			
			f.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
