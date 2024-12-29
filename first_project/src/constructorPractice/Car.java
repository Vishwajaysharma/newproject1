package constructorPractice;

public class Car {

	String make;
	String model; 
    int year;
	
	
	
	/**
	 * 7. Constructor with Default Values
       Write a Java program to create a class called Car with instance 
       variables make, model, and year. Implement a parameterized constructor
       that initializes these variables and assigns default values
       if not provided. Print the values of the variables.
	 */
	

	/**
	 * @param make
	 * @param model
	 * @param year
	 */
	public Car(String make, String model, int year) {
		super();
		
		this.make =  (make == null || make.isEmpty()) ? "Unknown Make" : make;
		this.model =  (model == null || model.isEmpty()) ? "Unknown Make" : model;
		this.year = (year <= 0) ? 2000 : year;;
	
	}

	public static void main(String[] args) {
		
		
		Car car1 =	new Car("porsche", "911", 1987);
		System.out.println(car1.make);
		System.out.println(car1.model);
		System.out.println(car1.year);
		
		
		

	}

}
