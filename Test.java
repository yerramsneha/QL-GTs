package demo;

public class Test {
	public static void main(String[] args)
	{
		B objB = new B();
		objB.print_A();
		objB.print_B();
		
		C objC = new C();
		objC.print_A();
		objC.print_C();
	
		D objD = new D();
		objD.print_A();
		objD.print_D();


	}

}
class A
{
	public void print_A()
	{
		System.out.println("class A");
	}
}
	class B extends A
	{
	public void print_B()
	{
		System.out.println("class B");
	}
	}
	class C extends A
	{
	public void print_C()
	{
		System.out.println("class C");
	}
	}
	class D extends A
	{
	public void print_D()
	{
		System.out.println("class D");
	}
	}
	
	
	
	

