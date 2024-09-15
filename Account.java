package bankaccountapp;

public abstract class Account implements IRate 
{
	//properties for Account
	private String name ;
	private String sSN;
	protected String accountNumber;
	private double balance;
	protected double rate;
	
	private static int index = 10000;
	 
	//constructor
	public Account(String name , String sSN , double initialDeposit)
	{
		this.name = name;
		this.sSN = sSN;
		balance = initialDeposit;
		//System.out.println("NAME : "+name + " SSN : "+sSN + " BALANCE : $" + balance);
		
		//set account number
		index++; 
		this.accountNumber = setAccountNumber();
		//System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
		//System.out.println(getBaseRate());
		
		setRate();
	}
	
	public abstract void setRate();
	//setAccountNumber Method
	private String setAccountNumber()
	{
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound()
	{
		double accuredInterest = balance * (rate/100);
		balance = balance + accuredInterest;
		System.out.println("The Accured Interest is $ : "+accuredInterest);
		printBalance();
	}
	
	//List common methods - transactions
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Depositing $ "+amount);
		printBalance();
	}
	
	public void withDraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Withdrawing $ "+amount);
		printBalance();
	}
	
	public void transfer(String toWhere , double amount)
	{
		balance = balance - amount;
		System.out.println("Transferring $ "+ amount + " to" + toWhere);
		printBalance();
	}
	
	public void printBalance()
	{
		System.out.println("Your balance is now $ " + balance);
	}
	
	
	public void showInfo()
	{
		System.out.println("NAME : "+name + "\nACCOUNT NUMBER : "+accountNumber +"\nBALANCE : "+balance+"\nRATE : "+rate+"%");
	}
	
}
