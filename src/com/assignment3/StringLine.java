package com.assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLine 
{
	public static void main(String[] args) 
	{
	     Pattern pattern = Pattern.compile("\"[a-zA-Z']+\"");  
	        Matcher matcher = pattern.matcher(" My Name is \"Revathi\" and i am from \"AndraPradesh\"   ");  
	          
	        while (matcher.find()) {  
	            System.out.println("" + matcher.group());  
	        }  
	    } 
}
