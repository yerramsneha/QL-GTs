package junitdemo;
import static org.junit.Assert.assertTrue;

import junit.framework.*;
public class javatest extends TestCase {
	 protected int value1, value2;
	   
	   // assigning the values
	   protected void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }

	   // test method to add two values
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
	   }
	}

