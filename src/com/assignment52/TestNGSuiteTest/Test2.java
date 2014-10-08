package com.assignment52.TestNGSuiteTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {


    String message = "revathi";
    MessageUtil messageutil = new MessageUtil(message);
    
    @Test
    public void testPrint2Message() {
    	System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "revathi";
        Assert.assertEquals(message,messageutil.print2Message());
    }

}
