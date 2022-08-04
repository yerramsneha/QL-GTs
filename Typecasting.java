package FunRun;

public class Typecasting {

	public static void main(String[] args) {
		
		//WideningTypeCasting
		
		int x = 7;  

		long y = x;  

		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  
		
		//NarrowTypeCasting
		
		double d = 166.66;  
		
		long l = (long)d;  
		  
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		
		System.out.println("After conversion into long type: "+l);  
		 
		System.out.println("After conversion into int type: "+i);  
	}

}
