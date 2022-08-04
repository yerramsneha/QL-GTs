package demo;

public class Overriding {
	public static void main(String args[])
	{
		SBI s=new SBI();
		AndhraBank a= new AndhraBank();
		Axis x= new Axis();
		Syndicate y= new Syndicate();
		s.display();
		System.out.println(" the ROI of SBI is" +s.getROI());
		System.out.println(" the ROI of AndhraBank is" +a.getROI());
		System.out.println(" the ROI of AxisBank is" +x.getROI());
		System.out.println(" the ROI of Syndicate is" +y.getROI());
	}
}



class Bank
{
	int getROI()
	{
		return 5;
	}
}

class SBI extends Bank
{
	void display()
	{
		System.out.println("the ROI of RBI is" +super.getROI());
	}
	int getROI()
	{
		return 8;
	}
}
class AndhraBank extends Bank
{
	int getROI()
	{
		return 10;
	}
}


class Axis extends Bank
{
	int getROI()
	{
		return 15;
	}
}
class Syndicate extends Bank
{
	int getROI()
	{
		return 12;
	}
}


