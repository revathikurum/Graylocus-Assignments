package com.assignment51.JUnitSuiteTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {

	String message = "SuiteTest";	
	   MessageUtil messageUtil = new MessageUtil(message);
	  
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "SuiteTest";
	      assertEquals(message,messageUtil.salutationMessage());
	   }
}
