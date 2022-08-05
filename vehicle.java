package opps;

class vehicle{
		
	public void  vehicle1() {
		System.out.println("vehicle is printied");
	}
	}
class car extends vehicle{
	public void car1() {
		 {
			System.out.println("car is printed");
			
		}
	}
	class bus extends vehicle{
		public void bus1() {
			System.out.println("bus is printed");
		}
	}
	class Auto extends vehicle{
		public void Auto1() {
			System.out.println("Auto is printed");
			}
	}
	class JavaExample{
		public void main(String[] arg) {
			car obj1 = new car();
			bus obj2 = new bus();
			Auto obj3 = new Auto();
			obj1.vehicle1();
			obj2.vehicle1();
			obj3.vehicle1();
		}
	}
	
}


			
		
		// TODO Auto-generated method stub




