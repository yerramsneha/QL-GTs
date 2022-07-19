package methods;

import java.io.IOException;

public class Methodthrows {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           M m=new M();
           try
           {
        	   m.method();
           }
           catch (IOException e)
           {
        	   System.out.println("exception handled");
           }
           System.out.println("normal flow...");
	}
}




class M
{
	void method() throws IOException
	{
		throw new IOException("device error");
	}
}
