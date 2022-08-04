package demo;

public class Final {
	public static void main(String args[])
	{
 one d = new one ();
d.sum();
	}
}

class  one
{
	final int a=100;
	void sum()
	{
		int a= 55;
		System.out.println("the a value is" +a);
	}
}