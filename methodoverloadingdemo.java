package wrapper;

public class methodoverloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder object =new Adder();
System.out.println(object.add(2,3));
System.out.println(object.add(8,9,7));
	}

}
class Adder
{
	int add(int a, int b) {
		return a+b;
	}

int add(int a,int b,int c)
{
	return a+b+c;
}
}
