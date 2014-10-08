package com.assignment52.TestNGSuiteTest;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message)
	{
		this.message = message;
	}
	
	public String print1Message()
	{
		System.out.println(message);
		return message;
		
	}
	
	public String print2Message()
	{
		message = "Hi" + message;
		System.out.println(message);
		return message;
	}
	
	public String finalMessage()
	{
		message = "Hi testng is working fine" + message;
		System.out.println(message);
		return message;
	}

}
