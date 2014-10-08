package com.assignment1;

public class ReverseSentence 
{
	public static void main(String[] args) 
	{
		String result = " ";
		String sentence = "He is good boy";
		String[] split = sentence.split(" ");	
		for(int i = split.length-1; i>=0; i--)
		{
			result += (split[i] + " ");
		}
		System.out.println(result.trim());
	}
}
