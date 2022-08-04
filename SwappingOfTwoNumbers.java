package FunRun;

import java.util.*;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		b = sc.nextInt();  
		System.out.println("Before swapping:");  
		System.out.println("a = " +a +", b = " +b);  
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		System.out.println("After swapping:");  
		System.out.print("a = " +a +", b = " +b);  
	
		sc.close();
	
	}

}
