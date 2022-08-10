package junitdemo;
public class MessageUtil 
{
    private String message;

       //Constructor
       //@param message to be printed
       public MessageUtil(String message)
       {
          this.message = message; 
       }
       // prints the message
       public void printMessage()
       {
    	   int a=0;
    	   int b=a/1;
          System.out.println(message);
       }   

       // add "Hz!" to the message
       public String salutationMessage()
       {
          message = "Hi!" + message;
          System.out.println(message);
          return message;
       }   
    }      