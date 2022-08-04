package programs;

public class Swap {
	public static void main(String args[])
	{
int x = 44;
int y = 48;
System.out.println("values before swapping:");
System.out.println("x= "+x+ "y =" +y);
x=x*y;
y=x/y;
x=x/y;
System.out.println("values after swapping:");
System.out.println("x = "+x+ "y =" +y);
	}
}
