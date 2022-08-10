package class001;

public class variables
{
	public String name ="New one";
	public static int id = 110;
	public static void main(String[] args) 
	{
		int a=100;
		
		variables s = new variables();
		// TODO Auto-generated method stub
		System.out.println("static variable"+ id);
		System.out.println("instance variable:"+s.name);
		System.out.println("Local variable:"+a);
	
	}
}

