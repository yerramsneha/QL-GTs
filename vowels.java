package demo;
import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
    
   
    System.out.println("enter the character:");
    char ch=((s.nextLine()).charAt(0));
    switch (ch)
    {
    case 'a':
    		System.out.println("this is a vowel");
    		break;
    case 'e':
    	    System.out.println("this is a vowel");
            break;
    case 'i':
    	    System.out.println("this is a vowel");
    	    break;
    case 'o':
    	    System.out.println("this is a vowel");
    	    break;
    case 'u':
    	    System.out.println("this is a vowel");
    	    break;
    default:
    	    System.out.println("this is a consonant");
    	    break; 
    }

}
}
	