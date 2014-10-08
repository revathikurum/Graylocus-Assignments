package com.assignment4;

public class Armstrong 
{
	public static void main(String args[])
	   {
	      int num = 407;
	      int n = num;
	      int check = 0, remainder;
	      while(num>0)
	      {
	    	  remainder = num%10;
	    	  check = check+(int)Math.pow(remainder, 3);
	    	  num = num/10;
	      }
	      if(check==n)
	      {
	    	  System.out.println(n+" is an armstrongnumber");
	      }
	      else
	      {
	    	  System.out.println(n+" is not an armstrongnumber");
	      }
	      
	   }
}
