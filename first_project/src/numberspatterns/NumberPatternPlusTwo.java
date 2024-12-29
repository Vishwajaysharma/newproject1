package numberspatterns;

public class NumberPatternPlusTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1, k = 0; i <= n ; i++ ,k+=2) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(k+" ");
			} 
			System.out.println();
		}
		
		
	}

}
