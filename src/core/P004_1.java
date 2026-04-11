package core;

public class P004_1 {
String name ;
int age;

public void display(){
	System.out.println("Student name "+name);
	System.out.println("student age "+age);
}

public static void main(String[] args) {
	P004_1 s1 = new P004_1();
	s1.name ="vardan";
	s1.age=24;
	s1.display();
}
}
