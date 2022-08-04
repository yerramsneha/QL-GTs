package FunRun;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 200;
		System.out.println("Even Numbers: ");
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\n");
			}
		}
		
		System.out.println("Odd Numbers: ");
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 1) {
				System.out.print(i + "\n");
			}
		}
	}
}
