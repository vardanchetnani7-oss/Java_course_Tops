package core;
abstract class TV{
	abstract void turnOn();
	abstract void turnOff();
}

class TVRemote extends TV{
	void turnOff() {
	System.out.println("TV is turned ON ");	
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv is turned off");
	}
}
public class P10_1 {
public static void main(String[] args) {
	TV remote =new TVRemote();
	remote.turnOn();
	remote.turnOff();
}
}
