package presentation14;

public class Defaultmethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Tclass d = new Tclass();
        d.square(4);
        d.show();
	}

}


interface TestInterface
{
   
    public void square(int a);
  
  
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
class Tclass implements TestInterface
{
   
    public void square(int a)
    {
        System.out.println(a*a);
    }
}
