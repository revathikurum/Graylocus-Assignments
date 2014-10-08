package com.assignment1;


public class Pyramid 
{
	public static void main(String[] args) 
	{
      int i, j, n=9, m;
		
      for(i=1; i<=n; i+=2)
		{
			for(m=i; m<n; m+=2)
			{
				System.out.print("  ");
			}
			
			for(j=1; j<=i; j=j+2)
			{
				System.out.print(j+ "   " );
				
			}
		System.out.println();
	         
	    } 
		 
	 
	    }
}



