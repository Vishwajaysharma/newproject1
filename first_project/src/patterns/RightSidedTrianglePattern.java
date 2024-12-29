package patterns;

import java.util.Scanner;

public class RightSidedTrianglePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i,j;
		int n = scan.nextInt(); 
		for (i = 1; i<=n ; i++ ) {
			
			for (j = i ; j < n ; j++) {
				System.out.print("  ");
			}
			for (j = 0 ; j < i ; j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
	}

}
