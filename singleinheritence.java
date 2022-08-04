package inheritence;
class Employee 
{
	void salary() 
{
		System.out.println("Salary= 200000");}
	}
class Programmer extends Employee {// Programmer class inherits from Employee classvoid bonus() 
	{System.out.println("Bonus=50000");}}

public class singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Programmer p = new Programmer();p.salary(); // calls method of super classp.bonus(); // calls method of sub class
		}}}



