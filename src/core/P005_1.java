package core;

public class P005_1 {
int findmaximum(int a ,int b ,int c) {
	int max;
	if(a>=b && a>=c) {
		max =a;
	} else if (b >= a && b >= c) {
        max = b;
    } else {
        max = c;
    }
	 return max;
}
public static void main(String[] args) {
	P005_1 p1 = new P005_1();
	
	int result  = p1.findmaximum(10,20, 30);
	System.out.println("RESULT IS " +result);
	
}
}
