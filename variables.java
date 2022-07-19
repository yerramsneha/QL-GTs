package demo;

public class variables {
public String name = "java";
public static int empno = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          variables obj = new variables();
          obj.age();
          System.out.println("instance variable name:" + obj.name);
          System.out.println("static variable name:"+empno);
	}
	public void age()
	{
		int age = 12;
		System.out.println("local variable age:"+age);
		
	}

}
