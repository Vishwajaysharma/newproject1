package constructorPractice;

public class cat {
/**
 * 1. Default Constructor:
 * Write a Java program to create a class called "Cat"
 * with instance variables name and age. Implement a 
 * default constructor that initializes
 * the name to "Unknown" and the age to 0.
 * Print the values of the variables.
 */
	
		String name ;
		int age;
		
	
	
	
	
	public static void main(String[] args) {
		
		cat c1 = new cat();
		c1.name = "unknown";
		System.out.println(c1.name);
		System.out.println(c1.age);
		
	}

}
