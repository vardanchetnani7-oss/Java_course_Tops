package core;
class box1{
	int height;
	int width;
	int depth;
	
	box1(int h,int w,int d){
		height= h;
		width= w;
		depth= d;
	}
	box1(int len){
		width=height=depth = len;	
}
int volume1() {
	return width*height*depth;
}
}

public class P007_2 {
	public static void main(String[] args) {
		box1 b1 = new box1(10,20,30);
		box1 b2 = new box1(10);
		
		System.out.println("volume of box1  "+b1.volume1());
		System.out.println("volume of box2 "+b2.volume1());
}
}

