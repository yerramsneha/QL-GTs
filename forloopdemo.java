package loops;

public class forloopdemo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Nested for loop");
		for(int i=1;i<3;i++)
		{
			  //loop of j
			for(int j=1;j<3;j++)
			{
				System.out.println(i+" "+j);
			}//end of i
		    }//end of j  
		 System.out.println("pyramid");
		 for(int i=1;i<=5;i++){
			 for(int j=1;j<=i;j++){
				 System.out.println("* ");
			 }
			 System.out.println();//new line
		 }
		 System.out.println("Reverse pyramid");
		 int term=6;
		 for(int i=1;i<=term;i++){
			 for(int j=term;j>=i;j--){
				 System.out.println("* ");
				 
			 }
			 System.out.println();//new line
		 }
	}

}
