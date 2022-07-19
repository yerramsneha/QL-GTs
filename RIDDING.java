package presentation14;

public class RIDDING {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Bike2 obj = new Bike2();
        obj.run();
	}

}


class car
{
	void run()
	{
		System.out.println("car is running");
	}
}

class Bike2 extends car
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
	
}
