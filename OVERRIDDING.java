package oopstypes;

public class OVERRIDDING {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateofInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateofInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateofInterest());
        
	}

}



class Bank
{
	int getRateofInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateofInterest()
	{
		return 8;
	}
}

class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}

class AXIS extends Bank
{
	int getRateofInterest()
	{
		return 9;
	}
}