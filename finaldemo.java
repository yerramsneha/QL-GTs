package opps;

public class finaldemo {

	public static void main(String[] args) {
		new cat().eat();
		new  dog().burk();
		
		
		
		// TODO Auto-generated method stub

	}

} class dog{
	 final void burk() {
		System.out.println("dog:burk");
	}
}
class cat extends dog{
	  void eat() {
		System.out.println("cat:eat");
	}
	
}

