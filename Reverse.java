package programs;

public class Reverse {
	public static void main(String args[])
	{
		int num = 56,reverse=0;
		while (num!=0)
		{
			 int rem = num%10;
			reverse = reverse*10 +rem;
			num = num/10;
		}
		System.out.println("The reverse of the given number is:" +reverse);
	}
	
	}


