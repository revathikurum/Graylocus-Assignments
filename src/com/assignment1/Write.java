package com.assignment1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Write 
{
	public static void main(String[] args) {
		        System.out.println("THIS is what I see on the console. but not on TEXT file"); 

		          File f = new File("E://Files/hi.txt");
		          if(!f.exists())
		          {
		            try {
		                       f.createNewFile();
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		          }

		        try {
		                FileOutputStream fos = new FileOutputStream(f);
		                PrintStream ps = new PrintStream(fos);
		                System.setOut(ps);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.println("THIS is what I see on the text file, but not on CONSOLE");      

		        for (int i=0; i<10; i++){

		            System.out.println("Testing");  
		        }

		    }

		
	     
	    }

