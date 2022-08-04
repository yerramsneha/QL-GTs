package demo;
class Abc
{
public void	Msg1()
	{
		System.out.println("message of class A");
	}
}
class Bdg extends Abc
{
	public void Msg2()
	{
		System.out.println("message of class B extended to A");
	}
}
class Crt extends Bdg
{
public void Msg3()
{
System.out.println("This is a subchild class");
}
}

public class Multilevel {
	public static void main(String [] args)
	{
		 Crt d= new Crt();
		d.Msg1();
		d.Msg2();
		d.Msg3();
		
	}
}
