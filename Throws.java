package presentation14;

public class Throws 
{
	 static void fun() throws IllegalAccessException
	    {
	        System.out.println("Inside fun(). ");
	        
	        throw new IllegalAccessException("demo");
	    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
        {
            fun();
        }
		
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
	}

}
