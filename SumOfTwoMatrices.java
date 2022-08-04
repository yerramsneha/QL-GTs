package FunRun;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,9,4},{4,4,3},{3,4,8}};    //Custom
		int b[][]={{1,11,4},{2,7,3},{1,6,4}};    //Custom
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+""
				+ "");    
		}    
		System.out.println();//new line    
		}  
	}

}
