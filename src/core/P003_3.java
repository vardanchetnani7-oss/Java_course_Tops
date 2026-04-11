package core;

public class P003_3 {
public static void main(String[] args) {
	int first =0 ,second=1;
	int next;
	int n=10;
	
	for(int i = 0;i<n;i++){
		System.out.println(first+"");
		next = first +second;
		first =second;
		second = next;
	}
}

}