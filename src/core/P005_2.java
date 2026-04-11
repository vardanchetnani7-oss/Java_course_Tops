package core;
class product{
	int multiply(int a,int b,int c) {
		return a*b*c;
	}
	
	int multiply(int a,int b) {
		return a*b;
	}
}
public class P005_2 {
	public static void main(String[] args) {
		product p1 = new product();
		
	int result1 = 	p1.multiply(10, 20);
	int result2 =  p1.multiply(10,20,30);
	System.out.println("method 1 "+result2);
	System.out.println("method 2 "+result1);
		
	}
}
