package core;
class parent2{
	public void call() {
		System.out.println("call in parent");
	}
}
	
class child5 extends parent2{
		public void call() {
			super.call();
			System.out.println("call in child");
		}
}
public class P009_3 {
public static void main(String[] args) {
	child5 c5 = new child5();
	c5.call();
}
}
