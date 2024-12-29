package patterns;

public class Dimandpatern {

	public static void main(String[] args) {
       int i,j ; 
       int n = 5 ; 
/* first row */		
       for (i = 0 ; i <= n ; i++) {
    	   
	          for (j = i ; j <= n ; j++) 
	                {
	                	System.out.print("  ");
	                }
	          for (j = 0 ; j <= i ; j++) 
              {
              	System.out.print("* ");
              }
	          
	          for (j = 0 ; j <= i-1 ; j++) 
              {
              	System.out.print("* ");
              }
	          for (j=i ; j<=n;j++) {
	        	  System.out.print("  ");
	          }
	          
	          
	System.out.println();
	
                 }
		
		
       for (i = 1 ; i <= n ; i++) {
    	   
	          for (j = 0 ; j <= i ; j++) 
	                {
	                	System.out.print("  ");
	                }
	          for (j = i ; j <= n ; j++) 
           {
           	System.out.print("* ");
           }
	          
	          for (j = i ; j <= n-1 ; j++) 
           {
           	System.out.print("* ");
           }
	          for (j=i ; j<=n;j++) {
	        	  System.out.print("  ");
	          }
	          
	          
	System.out.println();
	
              }
		
		
		
	}

}
