package oops;

import java.util.Scanner;

public class demo {
	int id;
	 String name;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         demo obj = new demo();
         System.out.println(obj.id);
         System.out.println(obj.name);
         
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the number:");
         int num = scan.nextInt();
         FindEvenOdd(num);
         
         demo obj1 = new demo ();
         int c = obj.add(5,6);
         System.out.println("The sum of a and b is= " + c);
	}
	private int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	demo()
	{
		System.out.println("Hello i am from constructor");
	}
      public static void FindEvenOdd(int num)
      {
    	  if(num%2==0)
    		  System.out.println(num+" is even");
    	  else
    		  System.out.println(num+" is odd");
      }
}
