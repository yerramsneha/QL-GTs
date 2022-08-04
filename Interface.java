package demo;

public class Interface {
	public static void main(String [] args)
	{
		Demo d=new Demo();
		d.sum();
		d.show();
		d.print();
	}
}


    Interface Printable
{
void print();
}
    
   Interface showable implements printable
{
	void show();

}
   

class Demo implements showable
{
	void sum()
	{
		System.out.println("this is a class");
	}
	void print()
	{
		System.out.println("this is printable");
	}
	void show()
	{
		System.out.println("this is showable");
	}
	}

