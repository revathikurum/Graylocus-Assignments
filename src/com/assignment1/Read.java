package com.assignment1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Read
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileInputStream fis = new FileInputStream("D:/test.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null)
        {
            out.append(line);
        }
        System.out.println(out.toString());  
        
        reader.close();
        
    }

}
