package core;
class parent {
	parent(){
		System.out.println("parent class inherited");
	}
}

class child extends parent{
	child(){
		System.out.println("child class");
	}
}
public class P006_1 {
public static void main(String[] args) {
	child c1 = new child();
	}
}
