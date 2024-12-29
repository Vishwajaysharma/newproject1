package new_javapractice;

import java.util.Scanner;

public class grading_project {

	public static int average(int[] marks) {
		int sum = 0; 
		for (int mark : marks) {
		   sum += mark;
		}
	    
		return sum / marks.length;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
	/*	System.out.println("enter the subject markes : ");
		System.out.println("English ");
		int english = scan.nextInt();
		System.out.println("maths ");
		int maths = scan.nextInt();
		System.out.println("hindi ");
		int hindi = scan.nextInt();
		System.out.println("science ");
		int science = scan.nextInt();
		System.out.println("phisics ");
		int phisics = scan.nextInt();*/

		int[] marks = new int[5];
	    String[] subjects = {"English", "Maths", "Hindi", "Science", "Physics"};
	    
	    
	    for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": ");
            marks[i] = scan.nextInt();
        }
	    
	     int av = average(marks);

		if (av >= 70 && av <= 80) {
			System.out.println("A");

		} else if (av >= 60 && av <= 70) {
			System.out.println("B");

		} else if (av >= 50 && av <= 60) {
			System.out.println("C");

		} else if (av >= 40 && av <= 50) {
			System.out.println("d");

		} else if (av >= 30 && av <= 40) {
			System.out.println("E");

		} else if(av >= 0 && av <= 30){
			System.out.println("Fail: better luck next time");
		}else {
			System.out.println("Invalid : Marks Entry");
		}
		scan.close();
		
		

	}

}
