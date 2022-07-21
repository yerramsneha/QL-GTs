package oops;

public class methodoverloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder obj = new Adder();
		System.out.println(obj.add(5, 6));
		System.out.println(obj.add(6,5,11));
		System.out.println(Adder.add1(22,22));
		System.out.println(Adder.add1(45.5,30.5));
	}

}
class Adder
{
     int add(int a, int b)
     {
         return a+b;
     }
     int add(int a, int b, int c)
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