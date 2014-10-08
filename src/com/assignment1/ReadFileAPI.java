package com.assignment1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadFileAPI 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("E://Files/revs.txt");
		String fileopen = FileUtils.readFileToString(f);
		System.out.println("Hi We are going launch Api........:\n" +fileopen);
	}
}
