package patterns;

public class HawlloinvertedtrianglePattern {

	public static void main(String[] args) {
	int i ,j ;
	int n = 5; 
	   for (i= 0 ; i <= n ; i++) {
		   
		   for (j = i  ; j <= n ; j++) {
			   if (i == 0 ||j == 0 || j == i || j == n )
			   {
				   System.out.print("* ");
			   }
			   else {
				   System.out.print("  ");
			   }
			   
		   }
		   System.out.println();
		   
	   }
	
	
	}

}
