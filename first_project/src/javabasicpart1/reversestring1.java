package javabasicpart1;

public class reversestring1 {

	public static void main(String[] args) {
		
		
		
       String a = " the reverse string " ;
       String b = "";
       char c;
      for (int i = a.length()-1; i>=0; i--) {
    	  
    	  c = a.charAt(i);  
    	  b = b + c;
      }
      System.out.println("Reversed String: " + b);
    }

}
