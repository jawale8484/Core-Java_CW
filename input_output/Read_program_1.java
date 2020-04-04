package input_output;

import java.io.*;


//1.	Write a program to read contents from file 
//and store reverse contents in another file
public class Read_program_1 {
	public static void main(String[] args) throws IOException {
		FileReader f= new FileReader("D:\\vaibhav.txt");
		int i=0;
		while((i=f.read())!=-1) {
			  System.out.print((char)i);
			  
		}
		
	}

}
