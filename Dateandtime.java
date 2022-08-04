package demo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dateandtime {
	public static void main(String[] args)
	{
	String s1="poornima";
	String s2="sri surya";
	char ch[]= {'p','o','o','r','n','i','m','a'};
	System.out.println(s1);
	System.out.println(s2);
	String s3= new String(s1);
	String s4= new String(ch);
	LocalDate obj = LocalDate.now();
	System.out.println(obj);
	LocalTime obj1 = LocalTime.now();
	System.out.println(obj1);
	LocalDateTime a = LocalDateTime.now();
	System.out.println("before formatting:" +a);
	DateTimeFormatter b=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
	//String formattedDate= obj.format(b);
	//System.out.println("after formatting:",+ formattedDate);
	}
}
	
	
	



