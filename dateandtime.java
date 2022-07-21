package defaultpackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 LocalDate myObj = LocalDate.now();
	        System.out.println(myObj); // Display the current date
	        LocalTime obj1 = LocalTime.now();
	        System.out.println(obj1);
	        LocalDateTime myObj1 = LocalDateTime.now();
	        System.out.println(myObj1);
	        LocalDateTime myDateObj = LocalDateTime.now();
	        System.out.println("Before formatting: " + myDateObj);
	        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	        String formattedDate = myDateObj.format(myFormatObj);
	        System.out.println("After formatting: "+ formattedDate);
	}

}
