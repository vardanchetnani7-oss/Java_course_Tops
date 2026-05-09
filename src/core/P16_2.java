package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P16_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		
		int b;
		while((b = fis.read())!=-1) {
			fos.write(b);
		}
			
		
		fis.close();
		fos.close();
			
		
	}
}
