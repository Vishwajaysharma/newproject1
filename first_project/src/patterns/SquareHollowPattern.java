package patterns;
public class SquareHollowPattern {
	 public static void printPattern(int n)
	 {
		 int i, j;
		 
		 for (i = 0; i < n; i++) {
			 
			 for (j = 0 ;j < n ;j++) {
			 
				 if ( j== 0 || i == 0 || j == n- 1 || i==n-1 ) {
					 
					 System.out.print("*");
					 
				 }
				 else {
					 System.out.print(" ");
				 }
				 
				 
			}
			 
			 
			System.out.println();
	 }
	 
	 }
	 

	public static void main(String[] args) {
		
		// Java Program to print pattern
		// Square hollow pattern
		
		   
		    // Driver Function
		   
		        int n = 10;
		        printPattern(n);
		    
		
		
		
		
		
	}

}
