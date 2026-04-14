package core;

public class P008_1 {
public static void main(String[] args) {
	int A[][] = {{1,2},{3,4}};
	int B[][] = {{1,1},{1,1}};
	
	
	int rows = A.length;
	int cols  = A[0].length;
	
	int sum[][] = new int[rows][cols];
	
	//adding two matrices
	
	for(int i = 0 ;i<rows ;i++) {
		for(int j =0 ;j<cols;j++) {
			sum[i][j] = A[i][j] + B[i][j];
		}
	}
	
	// printing the resultant matrix
	System.out.println("resultant matrix:");
	
	for(int i= 0;i<rows;i++) {
		for(int j = 0 ; j <cols ;j++) {
			System.out.print(sum[i][j]+" ");
		}
		
		System.out.println( );
	}
	//subtraction of the matrices;
	
	int sum1 [][] = new int [rows][cols];
	
	for(int i = 0 ; i < rows ; i++) {
		for(int j = 0 ; j < cols ; j++) {
			sum1[i][j] = A[i][j] - B[i][j];
		}
	}
	
System.out.println("resultant matrix:");
	
	for(int i= 0;i<rows;i++) {
		for(int j = 0 ; j <cols ;j++) {
			System.out.print(sum1[i][j]+" ");
		}
		
		System.out.println( );
	}
}
}
