package oops;

public class swap 
    {
      static void swapNumber(int x,int y)
      {
    	  System.out.println("Before swapping");
    	  System.out.println("x= " + x + ",y=" + y);
    	  x = x ^ y;
    	  y = x ^ y;
    	  x = x ^ y;
    	  System.out.println("After swapping");
    	  System.out.println("x= " + x + ",y=" + y);
      }
   
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int x = 12;
		 int y = 34;
		 swapNumber(x,y);
	}

}
