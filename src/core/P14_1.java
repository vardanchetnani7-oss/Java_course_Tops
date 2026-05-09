package core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class P14_1 {
	public static void main(String[] args) {
		try {
			
	File obj = new File("myfile.txt");
	Scanner reader =new Scanner(obj);
	while(reader.hasNextLine()) {
		String data  = reader.nextLine();
		System.out.println(data);}
	
	reader.close();
			// Write a file in java
//			FileWriter Writer = new FileWriter("myfile.txt");
//			Writer.write("file written in java");
//			Writer.close();
//			System.out.println("successfully written");
		}
		catch(IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
	}
}
