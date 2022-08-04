package demo;

public class Super {
public static void main(String args[])
{
	Dog d=new Dog();
	d.sound();
}
}



class Animal
{
	public void sound()
	{
		System.out.println("animals makes sound");
	}
}


class Dog extends Animal
{
	public void sound()
	{
		super.sound();
		System.out.println("dogs barks");
	}
}
