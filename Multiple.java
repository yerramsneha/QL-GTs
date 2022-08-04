package demo;

public class Multiple {
	public static void main(String args[])
	{
A7 obj = new A7();
obj.print();
obj.show();
}
}


interface Printable
{
	void print();
}

interface Showable
{
	void show();
}

class implements Printable.Showable
{
	public void print()
	{
	System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
