package project;

import java.util.Scanner;
import project1.Deposit;
import project1.Withdraw;

public class BankTransaction 
{
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      int pin=1111|2222|3333;
      System.out.println("Enter the pin");
      int pNo=s.nextInt();
      if(pNo==1111||pNo==2222||pNo==3333)
      {
    	  System.out.println("pin is verified");
    	  System.out.println("===choice===");
    	  System.out.println("1.withdraw\n2.deposit\n3.Balance Enquiry");
    	  System.out.println("Enter the choice");
    	  int choice=s.nextInt();
    	  
    	  switch(choice)
    	  {
    	  case 1:
    	     System.out.println("Enter Amount");
    	     int amt=s.nextInt();
    	     if(amt>0&&amt%100==0)
    	     {
    	    	 System.out.println("Enter the amount= "+amt);
    	    	 Withdraw w=new Withdraw();
    	    	 w.withdraw(amt); 
    	     }
    	     else
    	     {
    	    	 System.out.println("Invalid Amount");
    	     }
    	     break;
    	     
    	  case 2:
     	     System.out.println("Enter Amount");
     	     int V1=s.nextInt();
     	     if(V1>0&&V1%100==0)
     	     {
     	    	 System.out.println("Enter the amount= "+V1);
     	    	 Deposit d=new Deposit();
     	    	 d.deposit(V1);
     	     }
     	     else
     	     {
     	    	 System.out.println("Invalid Amount");
     	     }
     	     break; 
     	     
    	  case 3:
    		  int bal=2000;
    		  System.out.println("Total Balance = "+bal);
    		  System.out.println("THANK YOU");
    		  
    		  break;
    	  
          }
      }
      else
      {
    	  System.out.println("Invalid pin");
      }
      s.close();
	}
}

