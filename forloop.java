package class001;
import java.util.Scanner;

public class forloop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);

				int n=sc.nextInt();
				System.out.println("This is the pyramid");
			int i,j;	
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
			}

	}

