package demo;

public class Typecasting {
public static void main(String args[])
{
	int myint = 9;
	double mydouble =myint;
	System.out.println("widenning---automatic casting");
	System.out.println(myint);
	System.out.println( mydouble);
	System.out.println("Narrowing Casting----Manually done");
	double d =5.234d;
	int n = (int) d;
	System.out.println(d);
	System.out.println(n);
	
}
}

