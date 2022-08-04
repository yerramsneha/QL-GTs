package demo2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class dateandtimeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bhumi";
	    String s2="aarya";
	    char ch[]= {'b','h','u','m'};
	    System.out.println(s1);
	    System.out.println(s2);
	    String s3=new String (s1);
	    String s4= new String(ch);
	    LocalDate obj= LocalDate.now();
	    System.out.println(obj);
	    LocalTime  obj1 = LocalTime.now();
	    System.out.println(obj1);
	    LocalDateTime a= LocalDateTime.now();
	    System.out.println("before formatting:"+a);
	    DateTimeFormatter b=DateTimeFormatter.ofPattern( "dd-mm-yyyy hh:mm:ss");

	    //String  formattedDate= obj.format(b);

	    //System.out.println("after formatting:",+ formattedDate);
	}

}
