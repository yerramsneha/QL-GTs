package oops;

public class alternateprimenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         int num=20;
         System.out.print("Alternate prime numbers up to"+num+"are:");
         printalternateprimenumber(num);
	}
	static int checkPrime(int num)
	{
	int i,flag=0;
	for (i=2;i<=num/2;i++)
	{
		if(num%i == 0)
		{
			flag =1;
			break;
		}
	}		
	if(flag==0)
		return 1;
	else
		return 0;
	}
     static void printalternateprimenumber(int n)
{
	int temp=2;
	for(int num=2;num<=n-1;num++)
	{
		if(checkPrime(num)==1)
		{
			if(temp%2==0)
				System.out.print(num +" ");
			temp++;
		}
			
		}
	}
}

