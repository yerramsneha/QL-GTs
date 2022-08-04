package demo;

import java.util.Scanner;

public class oops {
	int id;
	String name;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		oops obj = new oops();
		System.out.println(obj.id);
		System.out.println(obj.name);
 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scan.nextInt();
		findEvenOdd(num);
		
		oops obj1 = new oops();
		int c = obj.add(5, 6);
		System.out.println("the sum of a and b is =" + c);
		

	}
	private int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	oops()
	{
		System.out.println("Hello i am from constructor");
	}
	public static void findEvenOdd(int num)
	{
		if(num%2==0)
			System.out.println(num+" is even");
		else
		    System.out.println(num+" is odd");
	}

}
