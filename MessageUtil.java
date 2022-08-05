package variables;


public class MessageUtil {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message){
	      this.message = message; 
	   }

	   // prints the message
	   public void printMessage(){
	      System.out.println(message);
	      int a = 0;
	      int b = 1/a;
	   }

	public Object salutationMessage() {
		// TODO Auto-generated method stub
		message ="Hi!"+ message;
		System.out.println(message);
		return message;
	} }  
