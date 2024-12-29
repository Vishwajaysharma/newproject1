package javabasicpart1;

import java.util.Scanner;

public class Exercise50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for (int i = a ; i<= b; i++) {
		if (i%3==0)	{
			
			System.out.println(" Divided by 3 : " + i);
		  }
		}
		for (int i = a ; i<= b; i++) {
		if (i%5==0) {
			System.out.println(" Divided by 5 : " + i);
		  }
		}
		for (int i = a ; i<= b; i++) {
		if (i%5==0 && i%3==0) {
			System.out.println(" Divided by 3 & 5 :"+ i);
		  }
		}
		
		
		
	}

}
