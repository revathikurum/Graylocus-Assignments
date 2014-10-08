package com.assignment51.JUnitSuiteTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit3 
{

	String message = "SuiteTest";	
	   MessageUtil messageUtil = new MessageUtil(message);
	  
	   @Test
	   public void testFinalMessage() 
	   {
	      System.out.println("Inside testFinalMessage()");
	      message = "Hi test case is working fine!" + "SuiteTest";
	      assertEquals(message,messageUtil.finalMessage());
	   }


}
