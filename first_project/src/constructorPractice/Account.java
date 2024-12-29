package constructorPractice;

public class Account {

	private String accountnumber;
	private double balance;
	
	
	/**6. Constructor with Validation
       Write a Java program to create a class called Account
       with instance variables accountNumber and balance.
       Implement a parameterized constructor that initializes
       these variables with validation:

      accountNumber should be non-null and non-empty.
      balance should be non-negative.
      Print an error message if the validation fails.
	 * @param accountnumber
	 * @param balance
	 */
	
	public Account(String accountnumber, double balance) {
		super();
		if (accountnumber == null || accountnumber.isEmpty()) {
			
			System.out.println("error accoutno. not entered");
		}
		if (balance < 0) {
			System.out.println("balance in negative");
		}
			
		this.accountnumber = accountnumber;
		this.balance = balance;
	}

	

	public static void main(String[] args) {
		
		Account acccount1	= new Account( "123444444432",  220.00);
		
		System.out.println(acccount1.accountnumber);
		System.out.println(acccount1.balance);
		
	}

}
