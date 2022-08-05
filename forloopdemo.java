package variables;

public class forloopdemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("nested for loop");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println(i+" "+j);
			}
		}
		System.out.println("pyramid");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(" * \t");
			}
			
		}
		System.out.println("reverse pyramid");
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.println(" *\t ");
			}
			
		}
		
			
		// TODO Auto-generated method stub

		}
	}
	


