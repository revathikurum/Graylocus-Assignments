package com.assignment1;


public class Traingle1 
{
	public static void main(String[] args) 
	{
		int no = 5;
		/* String str;
         

         try{
              BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
              System.out.print("Enter how many lines of triangle you want to generate : ");
              System.out.flush();
              str=obj.readLine();
              no=Integer.parseInt(str);*/

                  for(int i=1;i<=no;i++)
                  {
                         for(int j=1;j<=i;j++)
                         {
                              System.out.print("  "+i+"  ");
                              //System.out.flush();
                       }
                       System.out.println();
                  }
//              }
//       catch(Exception e)
//       {
//    	   
//       }
   }
}
