package INHERITANCE;

public class MULTIPLE {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
	}

}


interface seven {
    public void print_geek();
}
  
interface eight {
    public void print_for();
}
  
interface three extends seven, eight {
    public void print_geek();
}
class child implements three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }
  
    public void print_for() { System.out.println("for"); }
}
  
