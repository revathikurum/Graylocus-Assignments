package com.assignment52.TestNGSuiteTest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {


    String message = "revathi";
    MessageUtil messageutil = new MessageUtil(message);
    
    @Test
    public void testFinalMessage() {
    	System.out.println("Inside testFinalMessage()");
        message = "Hi testng is working fine!" + "revathi";
        Assert.assertEquals(message,messageutil.finalMessage());
    }

}
