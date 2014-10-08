package com.assignment1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WrileFileAPI 
{
	public static void main(String[] args) throws IOException
	{
		FileUtils.writeStringToFile(new File("E://Files/revathifile.txt"), "hello hi good morng\n");
		System.out.println("Hi Something we are doing in APIs......");
	}
}
