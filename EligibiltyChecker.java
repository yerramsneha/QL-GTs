package testRun;

import java.util.*;

public class EligibiltyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
				
		if(age >= 18) {
			System.out.println("You are above 18 and eligible to vote");
		}
		else {
			System.out.println("You are under 18 and not eligible to vote");
		}
	
	sc.close();
	}
}

