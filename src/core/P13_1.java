package core;

class CookingTask extends Thread{
	private String task;
	
	CookingTask(String task){
		this.task = task;
	}
	
	public void run() {
		System.out.println(task+" is being prepared by "+Thread.currentThread().getName());
	}
}

public class P13_1 {
public static void main(String[] args) {
	Thread t1  = new CookingTask("Pasta");
	Thread t2  = new CookingTask("Rice");
	
	t1.start();
	t2.start();
}
}
