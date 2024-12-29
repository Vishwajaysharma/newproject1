package patterns;

import java.util.Scanner;

public class RightSidedDecreasingTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i,j;
		int n = scan.nextInt(); 
		for (i = 1; i<=n ; i++ ) {
			for (j = 1; j<=i ; j++ ) {
				System.out.print("  ");
			   }
			
			for (j = i ; j <=n ; j++) {
				System.out.print("* ");
			}
			System.out.println();	
  			}
			
		}
	}


