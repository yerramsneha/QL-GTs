package opps;

public class cardemo {

	public static void main(String[] args) {
		
		class Car{
			   public Car()
			   {
				System.out.println("Class Car");
			   }
			   public void vehicleType()
			   {
				System.out.println("Vehicle Type: Car");
			   }
			}
			class Maruti extends Car{
			   public Maruti()
			   {
				System.out.println("Class Maruti");
			   }
			   public void brand()
			   {
				System.out.println("Brand: Maruti");
			   }
			   @SuppressWarnings("unused")
			public void speed()
			   {
				System.out.println("Max: 90Kmph");
			   }
			}
			 @SuppressWarnings("unused")
			class maruti800 extends Maruti{

			   public maruti800()
			   {
				System.out.println("Audi Model: 800");
			   }
			   public void speed()
			   {
				System.out.println("Max: 80Kmph");
			   }
			
			   {
				 maruti800 obj=new maruti800();
				 obj.vehicleType();
				 obj.brand();
				 obj.speed();
			   }
			}
		// TODO Auto-generated method stub

	}

}
