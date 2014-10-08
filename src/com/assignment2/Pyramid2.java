package com.assignment2;

public class Pyramid2
{
	public static void main(String[] args)
	{
		                   
	       for (int i =1; i<=12; i=i+2)
	       {
	       for (int j =1; j<=12-i; j+=2) 
	       {
	               System.out.print("  ");
	           }
	      
       for(int k=2; k<=i; k+=2) {
               System.out.print(" "+k);
       }
	       System.out.println("  ");

}
}
}
