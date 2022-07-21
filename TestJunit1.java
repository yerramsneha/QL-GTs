package junitdemo;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
public class TestJunit1 {
	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	 
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }
	}
	

