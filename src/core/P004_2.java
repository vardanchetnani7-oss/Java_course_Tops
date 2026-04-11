package core;


class box{
	int height;
	int width;
	int depth;
	
	box(int h,int w,int d){
		height= h;
		width= w;
		depth= d;
	}
	box(int len){
		width=height=depth = len;	
}
int volume() {
	return width*height*depth;
}
}

public class P004_2 {
	public static void main(String[] args) {
		box b1 = new box(10,20,30);
		box b2 = new box(10);
		
		System.out.println("volume of box1  "+b1.volume());
		System.out.println("volume of box2 "+b2.volume());
}
}

