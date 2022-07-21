package oops;

import java.util.Scanner;

   public class demo {
	int id;//field or data member or instance variable
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
        findEvenOdd(num);
        
        demo1 obj1 = new demo1();
        int c= obj1.add(5, 6);
        System.out.println("The sum of a and b is=" +c);
   }
   demo ()
   {
	    System.out.println("Hello iam from constructor"); 
	}
     public static void findEvenOdd(int num)
  {
    //method body
    	 if(num%2==0)
   System.out.println(num+" is even");
    	 else
   System.out.println(num+" is odd");	 
  }
}

   class demo1
   {
	   public int add(int n1,int n2)   //n1 and n2 are formal parameters
	   {
		int s;
		s=n1+n2;
		return s; //returning the sum
	   }
   }