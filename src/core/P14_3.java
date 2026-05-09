package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable{
	public int a;
	public String b;
	
	public test(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
public class P14_3 {
public static void main(String[] args) {
	test object = new test(1,"vardan");
	String filename = "file.ser";
	
	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(object);
		out.close();
		file.close();
		System.err.println("object has been serialized");
	}
	catch(IOException ex){
		System.out.println("IOexception is caught");
	}
	test object1 = null;
	
	//Deserialization
	
	try {
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in  = new ObjectInputStream(file);
		object1 =(test)in.readObject();
		in.close();
		file.close();
		System.out.println("object has been dserialized");
		System.out.println("a="+object1.a);
		System.out.println("b="+object1.b);
		}
	catch(IOException ex) {
		System.out.println("IO exception is caught");
	}
	catch(ClassNotFoundException ex) {
		System.out.println("classnotfound is caught");
	}
}
}
