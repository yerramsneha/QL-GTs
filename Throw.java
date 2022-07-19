package presentation14;

public class Throw 
{
	
	static void checkEligibilty(int stuage, int stuweight)
	{
		if(stuage<20 && stuweight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration"); 
		}
		else
		{
			System.out.println("Student Entry is Valid!!"); 
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Registration process!!");
	     checkEligibilty(25, 39); 
	     System.out.println("Have a nice day.."); 
	}

}
