package constructorPractice;

public class Dog {
	/**
	 *2. Parameterized Constructor:
         Write a Java program to create
            a class called Dog with instance variables
          name and color. Implement a parameterized 
  constructor that takes name and color as parameters and 
  initializes the instance variables. 
  Print the values of the variables. 

	 * */
	String name;
	String color;

	

	public Dog( String name, String color ) {
		super();
		this.name = name; 
		this.color= color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog	d1 = new Dog( "jimmy" , "red" );
		System.out.println(d1.name);
		System.out.println(d1.color);
	}

}
