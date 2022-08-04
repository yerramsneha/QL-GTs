package OOPS;

import java.util.Scanner;

public class Demo {
	int id;
	String name;

	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.id);
		System.out.println(obj.name);
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = scan.nextInt();
		findEvenOdd(num);

		Demo1 obj1 = new Demo1();
		int c = obj1.add(5, 6);
		System.out.println("The sum of a and b is= " + c);
	}

	Demo() {
		System.out.println("JAVA CONSTRUCTOR");
	}

	public static void findEvenOdd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}
}

class Demo1 {
	public int add(int n1, int n2) {
		int s;
		s = n1 + n2;
		return s;
	}
}
