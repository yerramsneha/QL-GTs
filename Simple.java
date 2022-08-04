package demo;

public class Simple {
	public static void main(String[] args)
	{
		calculator c= new calculator();
	    c.sum(10,20);
		c.sub(20,10);
		c.mul(5,2);
		c.div(4,2);
	}

}
class calculator extends Simple

{
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public void div(int a, int b)
	{
		System.out.println(a/b);
	}
}
  
  
  
