package input_output;

import java.io.*;

//3.	Write a program copy file contents into another file.
public class Copy {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("D:\\input.txt");
			BufferedReader br =new BufferedReader(fr);
			FileWriter fw=new FileWriter("D:\\Output.txt");
			String s;
			while((s=br.readLine())!=null) {
				fw.write(s);
				fw.flush();
			}
			
			fr.close();
			fw.close();
			System.out.println("File coppied Succesfully...");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
