package core;

import java.io.FileReader;
import java.io.FileWriter;
public class P16_3 {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("myfile.txt");
		FileWriter fw = new FileWriter("myfile2.txt");
		
		String str ="";
		int i;
		//condition check
		// reading the file using read()method which retund 01 at EOF while reading 
		while((i = fr.read())!=-1) {
			
			//stores every character int he string 
			str += (char)i;
		}
		
		//print and display the stirng that contains the data 
		System.out.println(str);
		
		//writing above string data to filewriter object
		fw.write(str);
		fr.close();
		fw.close();
		
		System.out.println("file reading and writing both done");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("there is some exception");
	}
}
}
