package core;
import java.io.*;

public class P12_1 {
public static void main(String[] args) {
	try {
		int res = 10/0;
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e);
	}
	finally {
		System.out.println("always exceute");
	}
	
}
}
