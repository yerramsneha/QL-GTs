package opps;

public class methodoverloadingdemo {

	public static void main(String[] args) {
		System.out.println(Multiple.multiple(2,9));
		System.out.println(Multiple.multiple(2,9,10));
		
		// TODO Auto-generated method stub

	}


}
class Multiple{
	static int multiple (int a, int b) {
		return a*b;
		
	}
	static int multiple(int a, int b, int c) {
		return a*b*c;
	}
	
}
