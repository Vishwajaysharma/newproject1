package constructorPractice;

/** 
 * 
 * 4. Chaining Constructors
Write a Java program to create a class called Student
with instance variables studentId, studentName, and grade.
 Implement a default constructor and a parameterized 
 constructor that takes all three instance variables.
 Use constructor chaining to initialize the variables.
 Print the values of the variables.
 *
 * */

public class Student {

	private String studentId; 
	private String studentName; 
	private int grade;
	     
	public Student() {
		this( 0 , "unknown" , "none");
	}
	
	public Student(int grade, String studentName, String studentId) {
		super();
		this.studentId = studentId ;
		this.studentName =  studentName;
		this.grade =  grade ;
	}



	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1.studentId);
		System.out.println(st1.studentName);
		System.out.println(st1.grade);
		
		Student st2 = new Student(101, "Cullen", "A");
		System.out.println( st2.studentName);
		System.out.println( st2.grade);
		System.out.println(st2.studentId);
		
	}



	

}
