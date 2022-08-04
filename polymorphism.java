package wrapper;
class bird{
	public void sing() {
	System.out.println("tweet tweet tweet ");
	}
}
class crow extends bird{
	
		
		crow()
		{
			super();
			System.out.println("kra kra  kra  ");
		}
		}


public class polymorphism {
	public static void main(String[] args) {

	{
	crow b = new crow();
	b.sing();
	}
}}
