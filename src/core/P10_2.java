package core;
interface interface1{
	public void interface1Method() ;
	
	public static void staticInterface1() {
		System.out.println("static interface 1");
	}
}

interface interface2{
	public void interface2Method();
	public static void staticInterface2() {
		System.out.println("static interface 2");
	}
}

class InterfaceCall implements interface1 ,interface2{

	@Override
	public void interface2Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

	@Override
	public void interface1Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}
	
}
public class P10_2 {
public static void main(String[] args) {
	InterfaceCall i = new InterfaceCall();
	i.interface1Method();
	i.interface2Method();
}
}
