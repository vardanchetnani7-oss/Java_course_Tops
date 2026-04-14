package core;
class father1{
	 father1(){
		 System.out.println("default constructor");
	 }
	 public void classfather1() {
		 System.out.println("method 1");
	 }
}

class child4 extends father1{
public void	classchild4(){
		System.out.println("method 2");
	}
}
public class P009_1 {
public static void main(String[] args) {
	child4 c4 = new child4();
	c4.classchild4();
}
}
