package variables;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks=95;
	        if(marks<35)
	        {
	            System.out.println("you are fail");

	        }
	        else if(marks>35 && marks<50)
	        {
	            System.out.println("You got D grade");
	        }
	        else if(marks>=50 && marks<60)
	        {
	            System.out.println("You got C grade");    
	        }
	        else if(marks>60 && marks<70)
	        {
	            System.out.println("You got B grade");
	        }
	        else if(marks>=70 && marks<=80)
	        {
	            System.out.println("You got A grade");
	        }
	        else if(marks>=80 && marks<=95)
	        {
	            System.out.println("You got A+ grade");
	        }
	        else {
	            System.out.println("Invalid");
	        }
	    }
	}


