package icic.loan.carloan;

public class IcIcI implements Rbi
{

	@Override
	public void deposit()
	
	{
		// TODO Auto-generated method stub
		// here we give logic for deposit
		System.out.println("depositICICI");
	}

	@Override
	public void withdrawl() 
	{
		// TODO Auto-generated method stub
		System.out.println("withdrawlICICI");
	}

	public static void main(String[] args) {
		
		IcIcI ic =new IcIcI();
		ic.deposit();
		ic.withdrawl();
	}
	
	
}
