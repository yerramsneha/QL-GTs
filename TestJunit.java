package junitdemo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   String message = "Tony";    
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   (expected = ArithmeticException.class)
   public void testPrintMessage() 
   {    
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Tony";
      assertEquals(message,messageUtil.salutationMessage());
   }
}