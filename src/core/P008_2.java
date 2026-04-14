package core;

public class P008_2 {
public static boolean isPalindorme(String s) {
	
	s = s.toLowerCase();
	
	String rev = "";
	for(int i = s.length()-1;i>=0;i--) {
		rev = rev + s.charAt(i);
	}
	return s.equals(rev);
}

public static void main(String[]args) {
	String s = "level";
	
	if(isPalindorme(s)) {
		System.out.println(s+"  is palindorme");
	}
	else {
		System.out.println("not");
	}
}
}
