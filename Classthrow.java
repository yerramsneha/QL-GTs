package methods;

public class Classthrow
{
	
	static void checkAge(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("Access denied - you must be at back in given age group");
		}
		else
		{
			System.out.println("Access granted - You are old enough!");
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        checkAge(20);
	}

}
