package javabasicpart1;

import java.util.Scanner;

public class Exersise7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int z;
		for (int i = 1; i <= 10; i++) {

			z = x * i;
			System.out.println(x + " x " + i + " = " + z);
		}

	}

}
