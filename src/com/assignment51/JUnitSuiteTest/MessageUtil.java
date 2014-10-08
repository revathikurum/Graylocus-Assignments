package com.assignment51.JUnitSuiteTest;

public class MessageUtil 
{

	private String message;


	   public MessageUtil(String message){
	      this.message = message; 
	   }

	   
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

	   public String salutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;

	   }
	   public String finalMessage(){
		      message = "Hi test case is working fine!" + message;
		      System.out.println(message);
		      return message;
	   }
}
