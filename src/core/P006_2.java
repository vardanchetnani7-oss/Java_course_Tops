package core;
class parent1 {
	parent1(){
		System.out.println("parent class inherited");
	}
}

class child1 extends parent1{
	child1(){
		System.out.println("child1 inherited class");
	}
}

class child2 extends child1{
	child2(){
		System.out.println("child2 class");
	}
}
public class P006_2 {
public static void main(String[] args) {
	child2 c2 = new child2();
}
}
