package demo;

public class Polymorphism {
	public static void main(String [] args)
	{
Bike b =new Splendor();
b.run();
}
}





class Bike
{
	public void run()
	{
		System.out.println("running");
	}
}
	

class Splendor extends Bike
{
	public void run()
	{
		System.out.println("running safely with 60km");
	}
	
	
}