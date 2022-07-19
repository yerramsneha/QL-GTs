package presentation14;

import java.util.regex.Pattern;

public class Regularexpressions {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches(
	            "geeksforge*ks", "geeksforgeeks"));
		
		System.out.println(
	            Pattern.matches("g*geeks*", "geeksfor"));
	}

}
