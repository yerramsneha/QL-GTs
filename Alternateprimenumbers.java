package OOPS;

public class Alternateprimenumbers 
{
//main method
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		int num = 20;   
		//prints alternate prime numbers  
		System.out.print("Alternate prime numbers up to " + num+" are: ");    
		//method calling  
		printAlternatePrimeNumber(num);   
		}  
		//method checks that the number is prime or not  
		static int checkPrime(int num)   
		{   
		int i, flag = 0;   
		// we have started i=2 because 2 is a known prime number  
		for(i = 2; i<= num / 2; i++)   
		{   
		if(num % i == 0)   
		{   
		flag = 1;   
		break;   
		}   
		}   
		if(flag == 0)   
		return 1;   
		else  
		return 0;   
		}   
		//method for printing alternate prime numbers  
		static void printAlternatePrimeNumber(int n)   
		{   
		//if the value of temp variable is odd, we do not print the prime number  
		//if the value of temp variable is even, we print the prime number  
		int temp = 2;   
		for(int num = 2; num <= n-1; num++)   
		{   
		//checking the number is prime or not  
		if (checkPrime(num) == 1)   
		{    
		//prints the prime number if temp is even  
		if (temp % 2 == 0)   
			System.out.print(num + " ");   
		//increments the temp variable by 1  
		temp ++;   
		}   
		}   
		}   
		}  


