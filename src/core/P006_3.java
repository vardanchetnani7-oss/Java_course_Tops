package core;
class father {
	void role() {
		System.out.println("i am a person");
	}
}

class child3 extends father{
	void role() {
System.out.println("i am a father");
		
	}
}
public class P006_3 {
public static void main(String[] args) {
	child3 c3 =new child3();
	c3.role();
}
}
