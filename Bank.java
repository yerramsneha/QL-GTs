package Bankingapplication.java;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount obj1 = new BankAccount("Kishna","BA0001");
obj1.showMenu();
	}

}


class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance +amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{	
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction <0)
		{
			System.out.println("withdraw :" + Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
    void showMenu()
	{
	char option= '\0';
	Scanner scanner = new Scanner(System.in);
System.out.println("welcome "+customerName);
System.out.println("Your Id is  "+customerId);
System.out.println("\n");
System.out.println("A. check Balance");
System.out.println("B. Deposit");
System.out.println("C.withdraw");
System.out.println("D. Previous transaction");
System.out.println("E.Exit");

do 
{
	System.out.println("=====================================================================");
	System.out.println("Enter an option");
	option = scanner.next().charAt(0);
	System.out.println("\n");

	switch(option)
	{
	case 'A':
	
	System.out.println("------------------------------------------");
	System.out.println("Balance = " +balance);
	System.out.println("------------------------------------------");
    System.out.println("\n");
    break;
    
    case 'B':
    System.out.println("-------------------------------------------");
    System.out.println("Enter an amount to deposit:");
    System.out.println("--------------------------------------------");
		int amount = scanner.nextInt() ;
		deposit (amount);
    System.out.println("\n");
    break;
    
    case 'C':
    	System.out.println("-----------------------------------------");
    	System.out.println("Enter an amount to withdraw:");
    	int amount2 = scanner.nextInt();
    	withdraw(amount2);
    	System.out.println("\n");
        break;
    case 'D':
    	System.out.println("-----------------------------------------");
    	getpreviousTransaction();
    	System.out.println("------------------------------------------");
    	System.out.println("\n");
    	break;
    case 'E':
    	System.out.println("********************************************");
    	break;
    	
    	default:
    		System.out.println("Invalid Option!. please enter again");
    		break;
    		
	}
}while(option != 'E');
System.out.println("ThankYou for using our service");
}}
	
	
	
	
	
		