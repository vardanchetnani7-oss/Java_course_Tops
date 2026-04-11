package core;
class student{
	private String name ;
	//getter method used to get the data
	public String getName() {
		return name;
	}
	// setter method to set name
	public void setName(String name) {
		this.name = name;
	}
}
public class P004_3 {
public static void main(String[] args) {
	student s1 = new student();
	s1.setName("vardan");
	System.out.println("name " +s1.getName());
}
}
