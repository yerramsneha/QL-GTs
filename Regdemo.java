package methods;

import java.util.regex.*;

public class Regdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound)
        {
        	System.out.println("Match found");
        }
        else
        {
        	System.out.println("Match not found");
        }
	}

}
