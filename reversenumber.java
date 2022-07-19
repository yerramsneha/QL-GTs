package oops;
import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
           int n,temp,rem,sum=0;
           System.out.println("Enter the value:");
           int ch =s.nextInt();
           while(ch!=0)
           {
        	   rem = ch%10;
        	   sum = sum*10+rem;
        	   ch = ch/10;
           }
            System.out.println("enter the reverse number:"+sum);
           
	}

}
