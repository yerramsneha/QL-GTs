package testRun;

import java.util.*;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
	    char ch = sc.next().charAt(0);   
	    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	    {
	        //check for VOWEL or CONSONANT
	        switch(ch)
	        {
	            case 'A':
	            case 'E':
	            case 'I':
	            case 'O':
	            case 'U':
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is a vowel.");
	                break;
	            default:
	                System.out.println(ch + " is a consonant.");            
	        }
	    }
	    else
	    {
	        System.out.println(ch + " is not an alphabet");
	    }

	    sc.close();
	}

}
