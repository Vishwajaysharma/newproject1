package constructorPractice;

public class Point {
	int x;
	int y;

	/**Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with 
instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.
Overloading Constructors with Different Data Types

	 * @param x
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @param y
	 */
	public Point(double x, double y) {
		super();
		this.y = (int) y;
		this.x = (int) x;
	}
	 public void printPoint() {
	        System.out.println("Point (x, y): (" + x + ", " + y + ")");
	    }
	 public void add() {
	        System.out.println((double) x + y);
	    }
	public static void main(String[] args) {
	    Point x1= new Point(45.00, 29.2);
	    Point y1= new Point(45, 50);
	    
	    x1.printPoint();
	    y1.printPoint();
	    x1.add();
	    y1.add();
	  
	}

}
