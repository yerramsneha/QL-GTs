package ArrayClassesDemo;

import java.util.Scanner;

class Array001
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements into the array");
		n=sc.nextInt();
		//Creation of ARRAY
		int []array = new int [5];//Memory LOcatin of array
		
		System.out.println("Ente the elements into the array");
		for(int i=1;i<=n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Elements in the array are: ");
		{
			for(int i=1;i<=n;i++)
			{
				System.out.println(array[i]);
			}
			sc.close();
		}
	}
}