package programs;

public class Sum {
	public static void main(String args[]) {
		int[]arr = new int[] {2,4,6,8,10};
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum = sum +arr[i];		
	}
		System.out.println("Sum of all the elements of an array:" +sum);
	}
}
	




