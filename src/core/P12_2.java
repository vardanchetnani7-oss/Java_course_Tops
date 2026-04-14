package core;

public class P12_2 {
	public static void main(String[] args) {
		try { 
			int res = 10/0;
			int[] numbers = {1,2,3};
			
			System.out.println(numbers[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e);
	}
		catch(Exception e) {
			System.out.println("exception "+e.getMessage());
		}
}
}
