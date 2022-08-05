package opps;

import opps.car.bus;

public class hybrid {

	public static void main(String[] args) {
		class bus{
			public void disp() {
				System.out.println("bus");
			}
		}
			class car extends bus{
				public void disp() {
					System.out.println("car");
				}
			}
			class Auto extends bus
			{
				public void disp() {
					System.out.println("Auto");
				}
			}
			class train extends car
			{
				public void disp()
				{
					System.out.println("train");
				}
				train obj = new train();
				obj.disp();
				
				
				
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
