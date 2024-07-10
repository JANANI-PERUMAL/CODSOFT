package cs;
import java.util.Scanner;

public class Atm
{
	double acc_no;
	String name;
	double balance;
	int choice;
	Atm()
	{
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the account number:");
	 acc_no = sn.nextDouble();
	System.out.println("Enter the name of the account holder");
	 name = sn.next();
	System.out.println("Enter the balance");
	  balance =sn.nextDouble();
	System.out.println("Enter the choice 1.Deposit  2.Withdraw  3.Check balance  " ) ;
	choice=sn.nextInt();
	switch(choice)
	{
	case 1:
	{
		System.out.println("enter the amount to be deposited");
		double damount = sn.nextDouble();
		deposit(damount);
		checkbalance();
		break;
	}
	case 2:
	{
		System.out.println("enter the amount to be withdrawn");
		double wamount = sn.nextDouble();
		withdraw(wamount);
		checkbalance();
		break;
	}
	case 3:
	{
		
		checkbalance();
		break;
		
	}
	default :
		System.out.println("invalid choice");
	}
	}
	
	public void checkbalance() 
	{
		System.out.println("Balance: " +  balance);
	}

    private void withdraw(double amount)
    {
		
		if(balance>0 && amount>0 && balance>=amount)
		{
			balance -= amount;
			System.out.println("withdrawn amount:" + amount);
			//System.out.println("balance:" + balance);
		}
		else
		{
			System.out.println("amount can't be withdrawn");
		}
		
	}
    
    private void deposit(double amount)
    {
		
		if(amount>0)
		{
			 balance += amount;
			System.out.println("deposited amount:" + amount);
		   //System.out.println("balance:" + balance);
		}
		else
		{
			System.out.println("invalid amount");
		}
		
	}

    public static void main(String[] args)
   {
			new Atm();
   }
}
