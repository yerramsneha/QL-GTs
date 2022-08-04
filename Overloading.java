package demo;

import java.util.Scanner;

public class Overloading {
	public static void main(String [] args)
	{
	Scanner x= new Scanner(System.in);
	System.out.println("enter side");
	int side =x.nextInt();
	shape y= new shape();
	y.area(side);
	System.out.println("enter values of p and q");
	int p = x.nextInt();
	int q = x.nextInt();
	y.area(p,q);
	System.out.println("enter radius");
	float z =x.nextFloat();
	y.area(z);
}
}
	
	
	
	class shape
	{
		public void area(int s)
		{
			System.out.println("area of a square is" +s*s);
		}
		public void area(int l, int b)
		{
			System.out.println("area of a rectangle is" +l*b);
		}
		public void area(float r)
		{
			System.out.println("area of a circle is" +3.14*r*r);
		}
	}


