package OOPS;

import java.io.*;

public class Reversenumber {

	//function to reverse the number
	static int reverse(int n) {
		
		int rev = 0;// reversed number
		int rem;  // remainder
		
		while(n>0) {
			
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}
		return rev;		
	}
	//Driver function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 1234;
      
      System.out.print("Reversed number is "+ reverse(n));
	}

}
