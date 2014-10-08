package com.assignment52.TestNGSuiteTest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
	{

	    String message = "revathi";
	    MessageUtil messageutil = new MessageUtil(message);
	    
	    @Test
	    public void testPrint1Message() {
	        System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageutil.print1Message());
	

}
	}
