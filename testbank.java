package realexamples;

public class testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();  
        ICICI i=new ICICI();  
        AXIS a=new AXIS();  
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  

    }

}
//Creating a parent class.  
class Bank{  
int getRateOfInterest()
{return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(
        ){return 15;}  
}  

class ICICI extends Bank{  
int getRateOfInterest()
{return 16;}  
}  
class AXIS extends Bank{  
int getRateOfInterest()
{return 19;
}  
}
	


