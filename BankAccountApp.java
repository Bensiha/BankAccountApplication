package bankaccountapp;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args)
	{
		List<Account>accounts = new LinkedList<Account>();
		//Read a CSV file then create new account based on that data
		String file = "D:\\ANDRO FILES\\eclipse\\NewBankAccounts.csv";
		/*
		Checking checkAcc1 = new Checking("ANDRO" , "321456789" , 1500);
		
		Savings saveAcc1 = new Savings("BENSIHA","456789321" , 2500);
		
		saveAcc1.compound(); 
		
		saveAcc1.showInfo();
		
		System.out.println("********************************");
		
		checkAcc1.showInfo();
		
		
		//saveAcc1.deposit(5000);
		//saveAcc1.withDraw(200);
		//saveAcc1.transfer("Brokerage", 3000);
		*/
		
		//Read CSV file
		List<String[]> newAccountHolders = utilities.CSV.read(file); 
		for(String[] accountHolder : newAccountHolders)
		{
			// System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initialDeposit = Double.parseDouble(accountHolder[3]);
			
			//System.out.println(name+" "+sSN+" "+accountType+" "+initialDeposit);
			//System.out.println("NAME : "+name +"SSN : "+sSN+"ACCOUNT TYPE : "+accountType+"INITIAL DEPOSIT : "+initialDeposit);
			
			if(accountType.equals("Savings"))
			{
				//System.out.println("OPEN SAVINGS ACCOUNT");
				accounts.add(new Savings(name,sSN,initialDeposit));
			}
			else if(accountType.equals("Checking"))
			{
				//System.out.println("OPEN CHECKING ACCOUNT");
				accounts.add(new Checking(name,sSN,initialDeposit));
			}
			else
			{
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for(Account acc : accounts)
		{
			System.out.println("\n*******************************");
			acc.showInfo();
		}
		
		//accounts.get((int) Math.random() * accounts.size()).deposit(10000);
		//accounts.get((int) Math.random() * accounts.size()).deposit(1500);
	}

}
