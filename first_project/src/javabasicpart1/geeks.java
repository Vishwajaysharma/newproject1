package javabasicpart1;

public class geeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Program to Reverse a String
		// Using for loop
	
		  
		      
		        String s = "Geeks"; 
		        String r = "";
		        char ch;

		        for (int i = 0; i < s.length(); i++) {
		              
		              // extracts each character
		            ch = s.charAt(i);
		          
		              // adds each character in
		            // front of the existing string
		            r = ch + r; 
		        }
		      
		        System.out.println(r);
		    
		}
	

}
