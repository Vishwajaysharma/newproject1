package icic.loan.carloan;

public class HDFC implements Rbi{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("depositHDFC");
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("withdrawlHDFC");
	}
	
	public static void main(String[] args)
	{
	
		HDFC money =new HDFC();
		money.deposit();
		money.withdrawl();
		
	}

}
