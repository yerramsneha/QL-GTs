package presentation14;//abstract class

public class Abstrarealeg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}

}


interface A
 {  
     void a();  
     void b();  
     void c();  
     void d();  
 }  
  
abstract class B implements A
{  
   public void c()
    {
	System.out.println("I am c");
	}  
}  
  
class M extends B
{  
  public void a()
    {
	    System.out.println("I am a");
	}  
  public void b()
    {
	    System.out.println("I am b");
	}  
  public void d()
    {
	    System.out.println("I am d");
	}  
}  
