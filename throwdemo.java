package Exception;

public class throwdemo 
{
static void checkAge(int age)
{
	if (age < 18)
	{
     throw new ArithmeticExeception("Access denied - you must be atleast 18years");
     }
	else
	{
		System.out.println("Access granted-You are old enough!");
	}
}
public static void main(String args[])
{
	checkAge(24);
}
	}