package INHERITANCE;//multilevel inheritance

public class MULTI {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		six g = new six();
        g.print_c();
        g.print_for();
        g.print_java();
    
	}

}

class four {
    public void print_c()
    {
        System.out.println("c");
    }
}
  
class five extends four {
    public void print_for() { System.out.println("for"); }
}
  
class six extends five {
    public void print_java()
    {
        System.out.println("java");
    }
}
  
