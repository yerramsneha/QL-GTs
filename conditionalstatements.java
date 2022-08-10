
package class001;

public class conditionalstatements 
{

	public static void main(String[] args) 
	{
		int a=86,b=76;
		if (a>b)
		{
			System.out.println("Write a is biggest number");
		}
		else
		{
			System.out.println("Write b is biggest number");
		}
		
		System.out.println("IFELSE IF Statements");
		int x=45;
		if(x>=35 && x<=45)
		{
			System.out.println("He got c+ grade");
		}
		else if(x>=46 && x<=55)
		{
			System.out.println("He got C grade");
		}
		else if(x>=56 && x<=65)
		{
			System.out.println("He got B grade");
		}
		else if(x>=66 && x<=75)
		{
			System.out.println("He got B+ grade");
		}
		else if(x>=76 && x<=85)
		{
			System.out.println("He got A grade");
		}
		else if(x>=86 && x<=100)
		{
			System.out.println("He got O grade");
		}
		else
		{
			System.out.println("Invalid input you have entered");
		}
	}
	
}