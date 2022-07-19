package methods;

public class Trycatch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       try
       {
    	   //int data = 100/0;
    	   int[] mynum = {1,2,3};
    	   System.out.println(mynum[10]);
       }
       catch(Exception e)
       {
    	   System.out.println("something is wrong..");
       }
       finally
       {
    	   System.out.println("finally code");
       }
       System.out.println("rest of the code");
	}

}
