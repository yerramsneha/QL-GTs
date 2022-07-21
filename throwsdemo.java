package Exceptiondemo;
import java.io.IOException;
public class throwsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 M m=new M();
	     try {
	         m.method();
	     }
	     catch (IOException e) 
	     {
	    	// TODO Auto-generated catch block
	         System.out.println("Exception handled");
	     }
	     System.out.println("normal flow...");
	     
}
}


class M
{
void method()throws IOException
{
    throw new IOException("device error");
}
}