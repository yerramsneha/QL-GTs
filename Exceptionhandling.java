package presentation14;

public class Exceptionhandling {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			int divideByZero = 5 / 0; 
			}

		    catch (ArithmeticException e) 
		{
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		    
		    finally
		    {
		      System.out.println("This is the finally block");
		    }
	}

}