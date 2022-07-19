package presentation;

public class wrapperclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Integer aObj = Integer.valueOf(23);
        Double bObj = Double.valueOf(5.55);
        
        int a = aObj.intValue();
        Double b = bObj.doubleValue();
        
        System.out.println("The value of a: " + a);
        System.out.println("The Value of b: " + b);
	}

}
 