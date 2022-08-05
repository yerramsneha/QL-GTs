package opps;

public class methodoverridingdemo {

	public static void main(String[] args) {
		bike2 obj = new bike2();
		obj.run();
		// TODO Auto-generated method stub

	}

}
class vehicle{
	 void run() {
		System.out.println("bank details is printed");
		
	}
	class Bike2 extends vehicle//{
		// void run() {
			//System.out.println("sbi details are printed");
			
		//}
	//}
//}
