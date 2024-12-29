package patterns;

public class Decreasingtriangle {
/* i value increased so j value also increased and thats why it minus 1 star in every loop 
 * in first loop i =0 and j starts with 0 then goes to nine
 * in second loop i = 1 and j start with 1 and goes to 9 
 * 3 loop i =  2 and j start with 2 and goes to 9
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i , j ; 
	int n = 3;
			for ( i = 0 ; i < n ; i++) {
				for (j = i ; j < n ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			}

}
