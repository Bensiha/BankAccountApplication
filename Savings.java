package bankaccountapp;

public class Savings extends Account 
{
	//properties for savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	

	public Savings(String name , String sSN , double initialDeposit ) {
		super(name,sSN,initialDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		//System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
		//System.out.println("NEW SAVINGS ACCOUNT");
		
	}
	@Override
	public void setRate()
	{
		rate = getBaseRate() - .25;
		//System.out.println("Implement rate for savings");
	}
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
		safetyDepositBoxKey = (int) (Math.random()*Math.pow(10,4));
	}
	
	public void showInfo()
	{
		//System.out.println("ACCOUNT TYPE : Savings");
		super.showInfo();
		System.out.println("Your Savings Account Features : "+"\n Safety Deposit Box ID : "+safetyDepositBoxID+"\n Safety Deposit Box Key : "+safetyDepositBoxKey);
		
		
	}

}
