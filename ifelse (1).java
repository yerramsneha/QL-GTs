package variables;

public class ifelse {

	public static void main(String[] args) {
		int marks =90;
		if(marks<50)
		{System.out.println("fail");
		
		}
		else if (marks>=50 && marks<60)
{
	System.out.println("D grade");
}
		else if(marks>=60 && marks<70){
			System.out.println("C  grades");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("B grades");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("A grades");
		}
		else if(marks>90 && marks<100) {
			System.out.println("A+ grades");
		}
		else {
			System .out.println("Invalid");
		}
	

			}

}
