package project_files;

import java.util.*;

public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Airline Management System");
		
		//Screen display line start...
		System.out.println("Welcome to the system, insert a valid choice to continue based on your request: ");
		System.out.println("A: user account creation\n"
						 + "B: User account validation\n"
						 + "C: Tickets availability\n"
						 + "D: Tickets cancellation\n"
						 + "E: Statistics\n"
						 + "F: Exit"
						 + "\n");
	
		char userChoice = sc.nextLine().charAt(0);
		
		userSelection(userChoice);
		
		sc.close();
			
	}
	
	public static char userSelection(char userChoice) {
		
		switch(userChoice) {
	
		case 'A':
			System.out.println("User Account Creation");
			userAccountCreation();
			break;
		
		case 'B':
			System.out.println("User Account Validation");
			break;
		
		case 'C':
			System.out.println("Tickets Availabilty");
			ticketsAvailable(50);
			break;
		
		case 'D':
			System.out.println("Ticket cancellation");	
			System.out.println("Enter number of tickets to cancel: ");
			Scanner sc = new Scanner(System.in);
			int TicketsCancelled =  sc.nextInt();
			int TicketsAvailable = 1000;
			TicketCancellation(TicketsAvailable,TicketsCancelled);
			
			
			
			break;
		
		case 'E':
			System.out.println("Statistics");
			break;	
			
		case 'F' :
			System.out.println("Exit");
			break;
			
	
		default :
			System.out.println("Enter a valid choice..");
			break;
		
		}
		return userChoice;
		
	}	
	
	@SuppressWarnings("unused")
	public static void userAccountCreation() {
		
		int phoneNumber, ticketsAvailable;
		String userName, firstName, lastName;
		double accountNumber;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your user name");
		userName = sc.nextLine();
		System.out.println("Enter your First Name");
		firstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		lastName = sc.nextLine();
		
		System.out.println("Enter your Phone Number");
		phoneNumber = sc.nextInt();
		System.out.println("Enter your Account Number");
		accountNumber = sc.nextDouble();
		//System.out.println("");
		//ticketsAvailable = sc.nextInt();

		sc.close();
		
	}
	
	static int ticketsAvailable(int ticketRequested){
		@SuppressWarnings("unused")
		int ticketsRequested = ticketRequested;
		int TicketsAvailable = 1000;
		@SuppressWarnings("unused")
		int TicketsBooked = 0;
		
		if(TicketsAvailable >= 100) {
			TicketsAvailable = TicketsAvailable - ticketRequested;
		}
		System.out.println("TIckets Available are " + TicketsAvailable);
		return TicketsAvailable;
		
		
	}
	
	static int TicketCancellation(int TicketsAvailable, int TicketsCancelled){
		TicketsAvailable = TicketsAvailable + TicketsCancelled;
		System.out.println("Tickets available after cancellation are: " +
							TicketsAvailable);		
		return 0;
		
	}

}


