package variables;

public class variable {
	public static String name = "java";
	public static int empno=50;
      public static void main(String[] args)
      {
		// TODO Auto-generated method stub
		variable obj = new variable();
		obj.age();
		System .out.println("instance variable name:" +obj.name);
		System.out.println("static ariable name:"+empno);

	}
	public void age()
	{
		int age=10;
		System.out.println("local variable age:"+age);
	}

}
