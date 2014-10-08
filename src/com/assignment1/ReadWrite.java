package com.assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadWrite 
{
	public static void main(String[] args) throws IOException {
        try 
        {
               File InputFile = new File("E://Files/Input.txt");
               File OutputFile = new File("E://Files/Output.txt");

               

               FileInputStream fis = new FileInputStream(InputFile);
               FileOutputStream fos = new FileOutputStream(OutputFile);
               int count;

               while ((count = fis.read()) != -1) {
                     fos.write(count);
               }
               fis.close();
               fos.close();
        } catch (FileNotFoundException e) {
               System.out.println("FileStreamsReadnWrite: " + e);
        } catch (IOException e) {
               System.err.println("FileStreamsReadnWrite: " + e);
        }

	        InputStream in = new FileInputStream(new File("E://Files/Input.txt"));
	        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
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
