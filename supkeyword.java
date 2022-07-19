package presentation14;

public class supkeyword
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 scooty small = new scooty();
	        small.display();

	}

}


class Vehicle
{
	int maxSpeed = 60;
}

class scooty extends Vehicle
{
    int maxSpeed = 70;
  
    void display()
    {
        
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
  


   