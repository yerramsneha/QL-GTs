package oopstypes;

public class methodoverloading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Adder obj = new Adder();
      System.out.println(obj.add(2 , 3));
      System.out.println(obj.add(8, 9,7));
      System.out.println(Adder.add1(11, 11));
      System.out.println(Adder.add1(12.3,12.6));
	
	}

}

class Adder
{
	int add (int a, int b)
	{
		return a+b;
}
int add (int a, int b,int c)
{
	return a+b+c;
}
static int add1(int a, int b)
{
	return a+b;
}
static double add1(double a, double b)
{
	return a+b;
}

}