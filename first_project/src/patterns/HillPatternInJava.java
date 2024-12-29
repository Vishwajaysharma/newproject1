package patterns;

public class HillPatternInJava {

	public static void main(String[] args) {

		int i, j;
		int n = 6;
		for (i = 0; i <= n; i++) {
//3
/*			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}*/
		//1	
			for (j = i; j <= n; j++) {

				System.out.print("  ");
			}
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			for (j = 0; j <= i-1; j++) {

				System.out.print("* ");
			}
			for (j = i; j <= n; j++) {

				System.out.print("  ");
			}
			
			
			System.out.println();
		}

	}

}
