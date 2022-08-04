     package inheritence;

		public class multilevelinheritance 
		{

		    public static void main(String[] args)
		    {
		        // TODO Auto-generated method stub
		    }
		}
		class car {
		    public void display() {
		       System.out.println("Inside display");
		    }
		 }
		 class honda extends car {
		    public void area() {
		       System.out.println("Inside area");
		    }
		 }
		 class ritz  extends honda {
		    public void volume() {
		       System.out.println("Inside volume");
		    }
		 }
		 class tester {
		    public static void main(String[] arguments) {
		      ritz ritz= new ritz();
		       ritz.display();
		      ritz.area();
		       ritz.volume();
		    }
		 }
	



		