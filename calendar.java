package project7999;
import java.util.Calendar;
import java.util.Scanner;  
public class calendar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		        Calendar calendar = Calendar.getInstance();  
		           System.out.println("The current date is : " + calendar.getTime());  
		           calendar.add(Calendar.DATE, -15);  
		           System.out.println("15 days ago: " + calendar.getTime());  
		           calendar.add(Calendar.MONTH, 4);  
		           System.out.println("4 months later: " + calendar.getTime());  
		           calendar.add(Calendar.YEAR, 2);  
		           System.out.println("2 years later: " + calendar.getTime());  
		             System.out.println(" 2 years later Calendar's Year: " + calendar.get(Calendar.YEAR));     
		            System.out.print("2 years later Date And Time Is: " + calendar.getTime());  
		              int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
		           System.out.println("Maximum number of days in week: " + maximum);  
		           maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
		           System.out.println("Maximum number of weeks in year: " + maximum); 
		              int maximum1 = calendar.getMinimum(Calendar.DAY_OF_WEEK);  
		           System.out.println("Minimum number of days in week: " + maximum1);  
		           maximum1 = calendar.getMinimum(Calendar.WEEK_OF_YEAR);  
		           System.out.println("Minimum number of weeks in year: " + maximum1); 
		            try (Scanner user = new Scanner(System.in)) {
		                System.out.print("What year do you want to view? ");
		                int year = user.nextInt();
		                System.out.printf("%12d\n", year);
		                System.out.println();
		                boolean leap = isLeap(year);    
		                int firstDay = JulianDate(year);
		                monthLoop(year, firstDay, leap);
		            }
		        }

		        public static boolean isLeap(int year) {
		            boolean verdict = false;
		            if (year % 100 == 0 && year % 400 == 0) {
		                verdict = true;
		            }
		            if(year % 100 != 0 && year % 4 == 0) {
		                verdict = true;
		            }
		            return verdict;
		        }


		        public static int JulianDate(int year) {
		            Calendar calendar = Calendar.getInstance();
		            calendar.set(Calendar.YEAR, year);
		            calendar.set(Calendar.DAY_OF_YEAR, 1);
		            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		            return dayOfWeek;
		        }

		        public static void monthLoop(int year, int firstDay, boolean leap) {
		            for(int i=1; i <= 12; i++) {
		                switch (i) {
		                    case 1: System.out.printf("%13s\n", "January");
		                            break;
		                    case 2: System.out.printf("%13s\n", "February");
		                            break;
		                    case 3: System.out.printf("%12s\n", "March");
		                            break;
		                    case 4: System.out.printf("%12s\n", "April");
		                            break;
		                    case 5: System.out.printf("%11s\n", "May");
		                            break;
		                    case 6: System.out.printf("%11s\n", "June");
		                            break;
		                    case 7: System.out.printf("%11s\n", "July");
		                            break;
		                    case 8: System.out.printf("%13s\n", "August");
		                            break;
		                    case 9: System.out.printf("%14s\n", "September");
		                            break;
		                    case 10: System.out.printf("%13s\n", "October");
		                            break;
		                    case 11: System.out.printf("%14s\n", "November");
		                            break;
		                    case 12: System.out.printf("%14s\n", "December");
		                            break;                      
		                }

		            System.out.println("S  M  Tu W  Th F  S");

		            
		            }

		        }

}
