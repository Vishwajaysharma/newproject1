package javabasicpart1;


public class Exersice6 {
	
	
	 public static int multiplication (int num1 ,int num2) {
       int a; 
   	  a = num1*num2;
   	 
   	 return a ; 
   	 
    }
	 public static int add (int num1 ,int num2) {
		    int a; 
		   	  a = num1+num2;
		   	 
		   	 return a ; 
		   	 
		    }
	 public static int sub (int num1 ,int num2) {
		    int a; 
		   	  a = num1-num2;
		   	 
		   	 return a ; 
		   	 
		    }
	 public static int div (int num1 ,int num2) {
		    int a; 
		   	  a = num1/num2;
		   	 
		   	 return a ; 
		   	 
		    }
	 public static int mod (int num1 ,int num2) {
		    int a; 
		   	  a = num1%num2;
		   	 
		   	 return a ; 
		   	 
		    }
	 
	 // Calculate and print the remainder of the division of the two number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1 = 125;
    int num2 = 24;
    
    System.out.println(multiplication(num1,num2));
    System.out.println(add(num1,num2));
    System.out.println(sub(num1,num2));
    System.out.println(div(num1,num2));
    System.out.println(mod(num1,num2));
	}

}
