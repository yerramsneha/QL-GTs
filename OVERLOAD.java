package presentation14;

public class OVERLOAD {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	     DispOvrload o1 = new DispOvrload();
	     o1.show('R',32);
	     o1.show(26,'S');
	     
	}
}


class DispOvrload
{
	public void show(char ch, int numb)
	{
		System.out.println("The 'show method' is defind for the first time.");
	}
	public void show(int numb, char ch)
	{
		System.out.println("The 'show method' is defind for the second time.");
	}
}