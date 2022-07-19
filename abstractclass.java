package oopstypes;

public class abstractclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          abstractclass obj = new abstractclass();
          obj.run();
	}
	
	void run()
	{
		System.out.println("running safely");
	}
}

abstract class bike
{
	bike()
	{
		System.out.println("running safely"	);
	}
	abstract void run();
	void nonab()
	{
		System.out.println("running safely");
	}
}
