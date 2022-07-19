package oopstypes;

public class superclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          Dog d = new Dog();
          d.animalSound();
	}

}



class Animal
{
	String color = "white";
	public void animalSound()
	{
		System.out.println("The animal makes a sound");
	}
	Animal()
	{
		System.out.println("hello i am from constructor");
	}
	
}

class Dog extends Animal
{
	Dog()
	{
		super();
		System.out.println("this is call from child constructor");
	}
	public void animalSound()
	{
		super.animalSound();
		System.out.println("The dog says: bow bow ");
		
	}
}