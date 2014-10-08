package com.assignment51.JUnitSuiteTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {

	   String message = "SuiteTest";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test
	   public void testPrintMessage() 
	   {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, messageUtil.printMessage());  

}
}
