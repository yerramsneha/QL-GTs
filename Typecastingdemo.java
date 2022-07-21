package miss;

public class Typecastingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int myint = 7;
		 double mydouble = myint; // automatic casting int to double
		 System.out.println("widenning--- automatic casting");
		 System.out.println(myint); //7
		 System.out.println(mydouble); //7.5
         System.out.println("Narrowing casting---- Manually done");
         double d = 7.634d;
         int n = (int) d;
         System.out.println(d); //7
         System.out.println(n); //7.5
	}
}
