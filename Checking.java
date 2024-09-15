package bankaccountapp;

public class Checking extends Account 
{
	//properties for checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//constructor
	public Checking(String name , String sSN , double initialDeposit) 
	{
		super(name,sSN,initialDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCardNumber();
		//System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
		//System.out.println("NEW CHECKING ACCOUNT");
		
	}

	@Override
	public void setRate()
	{
		rate = getBaseRate() * .15;
		//System.out.println("Implement rate for checking");
	}
	private void setDebitCardNumber()
	{
		debitCardNumber = (int) (Math.random()*Math.pow(10,12));
		debitCardPIN = (int) (Math.random()*Math.pow(10, 4));
		//System.out.println("CARD : "+this.debitCardNumber);
		//System.out.println("PIN : "+this.debitCardPIN);
	}
	 public void showInfo()
	 {
		 
		 //System.out.println("ACCOUNT TYPE : Checking");
		 super.showInfo();
		 System.out.println("Your Checking Account Features : "+"\nDebit Card Number : "+debitCardNumber +"\nDebit Card PIN : "+debitCardPIN);
	 }
}
